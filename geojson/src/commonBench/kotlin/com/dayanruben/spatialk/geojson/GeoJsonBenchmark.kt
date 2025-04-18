@file:Suppress("MagicNumber")

package com.dayanruben.spatialk.geojson

import com.dayanruben.spatialk.geojson.dsl.featureCollection
import com.dayanruben.spatialk.geojson.dsl.lineString
import com.dayanruben.spatialk.geojson.dsl.point
import com.dayanruben.spatialk.geojson.dsl.polygon
import kotlinx.benchmark.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlin.random.Random

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(BenchmarkTimeUnit.MILLISECONDS)
open class GeoJsonBenchmark {
    private lateinit var dataset: FeatureCollection
    private lateinit var geojson: String
    private lateinit var jsonObject: JsonObject

    private fun generateDataset(): FeatureCollection {
        val random = Random(0)
        return featureCollection {
            repeat(5000) {
                feature(geometry = point(random.nextDouble(360.0) - 180, random.nextDouble(360.0) - 180))
            }

            repeat(5000) {
                feature(geometry = lineString {
                    repeat(10) {
                        +Position(random.nextDouble(360.0) - 180, random.nextDouble(360.0) - 180)
                    }
                })
            }

            repeat(5000) {
                feature(geometry = polygon {
                    ring {
                        repeat(10) {
                            +Position(random.nextDouble(360.0) - 180, random.nextDouble(360.0) - 180)
                        }
                    }
                })
            }
        }
    }

    @Setup
    fun setup() {
        dataset = generateDataset()
        geojson = dataset.json()
        jsonObject = Json.decodeFromString(geojson)
    }

    /**
     * Benchmark serialization using the string concat implementation
     */
    @Benchmark
    fun fastSerialization() {
        dataset.json()
    }

    /**
     * Benchmark serialization using plain kotlinx.serialization
     */
    @Benchmark
    fun kotlinxSerialization() {
        Json.encodeToString(dataset)
    }

    /**
     * Benchmark how fast kotlinx.serialization can encode a GeoJSON structure directly
     */
    @Benchmark
    fun baselineSerialization() {
        Json.encodeToString(jsonObject)
    }


    @Benchmark
    fun deserialization() {
        FeatureCollection.fromJson(geojson)
    }
}
