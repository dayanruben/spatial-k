@file:JvmName("-FeatureCollectionDslKt")

package com.dayanruben.spatialk.geojson.dsl

import com.dayanruben.spatialk.geojson.BoundingBox
import com.dayanruben.spatialk.geojson.Feature
import com.dayanruben.spatialk.geojson.FeatureCollection
import com.dayanruben.spatialk.geojson.Geometry
import kotlin.jvm.JvmName

@GeoJsonDsl
public class FeatureCollectionDsl(
    private val features: MutableList<Feature> = mutableListOf(),
    public var bbox: BoundingBox? = null
) {
    public operator fun Feature.unaryPlus() {
        features.add(this)
    }

    public fun create(): FeatureCollection =
        FeatureCollection(features, bbox)

    public fun feature(
        geometry: Geometry? = null,
        id: String? = null,
        bbox: BoundingBox? = null,
        properties: PropertiesBuilder.() -> Unit = {}
    ) {
        +Feature(geometry, PropertiesBuilder().apply(properties).build(), id, bbox)
    }
}

@GeoJsonDsl
public inline fun featureCollection(block: FeatureCollectionDsl.() -> Unit): FeatureCollection = FeatureCollectionDsl()
    .apply(block).create()
