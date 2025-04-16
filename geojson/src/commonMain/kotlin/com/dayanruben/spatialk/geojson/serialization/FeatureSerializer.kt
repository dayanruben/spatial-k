package com.dayanruben.spatialk.geojson.serialization

import com.dayanruben.spatialk.geojson.Feature
import com.dayanruben.spatialk.geojson.serialization.BoundingBoxSerializer.toJsonArray
import com.dayanruben.spatialk.geojson.serialization.GeometrySerializer.toJsonObject
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.json.*

public object FeatureSerializer : JsonSerializer<Feature> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Feature")

    override fun deserialize(input: JsonDecoder): Feature = Feature.fromJson(input.decodeJsonElement().jsonObject)

    override fun serialize(output: JsonEncoder, value: Feature) {
        output.encodeJsonElement(value.toJsonObject())
    }

    internal fun Feature.toJsonObject() = buildJsonObject {
        put("type", "Feature")
        bbox?.let { put("bbox", it.toJsonArray()) }
        geometry?.let { put("geometry", it.toJsonObject()) }
        id?.let { put("id", it) }

        put("properties", JsonObject(properties))
    }
}
