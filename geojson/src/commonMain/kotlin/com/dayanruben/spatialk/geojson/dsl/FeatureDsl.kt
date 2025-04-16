@file:JvmName("-FeatureDslKt")
@file:Suppress("MatchingDeclarationName")

package com.dayanruben.spatialk.geojson.dsl

import com.dayanruben.spatialk.geojson.BoundingBox
import com.dayanruben.spatialk.geojson.Feature
import com.dayanruben.spatialk.geojson.Geometry
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlin.jvm.JvmName

@GeoJsonDsl
public class PropertiesBuilder {
    private val properties = mutableMapOf<String, JsonElement>()

    public fun put(key: String, value: String?) {
        properties[key] = JsonPrimitive(value)
    }

    public fun put(key: String, value: Number?) {
        properties[key] = JsonPrimitive(value)
    }

    public fun put(key: String, value: Boolean?) {
        properties[key] = JsonPrimitive(value)
    }

    public fun put(key: String, value: JsonElement) {
        properties[key] = value
    }

    public fun build(): Map<String, JsonElement> = properties
}

@GeoJsonDsl
public inline fun feature(
    geometry: Geometry? = null,
    id: String? = null,
    bbox: BoundingBox? = null,
    properties: PropertiesBuilder.() -> Unit = {}
): Feature = Feature(geometry, PropertiesBuilder().apply(properties).build(), id, bbox)
