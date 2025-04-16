@file:JvmName("TurfMeta")

package com.dayanruben.spatialk.turf

import com.dayanruben.spatialk.geojson.*
import kotlin.jvm.JvmName

@ExperimentalTurfApi
public fun Geometry.coordAll(): List<Position> = when (this) {
    is Point -> this.coordAll()
    is MultiPoint -> this.coordAll()
    is LineString -> this.coordAll()
    is MultiLineString -> this.coordAll()
    is Polygon -> this.coordAll()
    is MultiPolygon -> this.coordAll()
    is GeometryCollection -> this.coordAll()
}

@ExperimentalTurfApi
public fun Point.coordAll(): List<Position> = listOf(coordinates)

@ExperimentalTurfApi
public fun MultiPoint.coordAll(): List<Position> = coordinates

@ExperimentalTurfApi
public fun LineString.coordAll(): List<Position> = coordinates

@ExperimentalTurfApi
public fun MultiLineString.coordAll(): List<Position> = coordinates.reduce { acc, list -> acc + list }

@ExperimentalTurfApi
public fun Polygon.coordAll(): List<Position> = coordinates.reduce { acc, list -> acc + list }

@ExperimentalTurfApi
public fun MultiPolygon.coordAll(): List<Position> =
    coordinates.fold(emptyList<Position>()) { acc, list ->
        list.reduce { innerAcc, innerList -> innerAcc + innerList } + acc
    }

@ExperimentalTurfApi
public fun GeometryCollection.coordAll(): List<Position> =
    geometries.fold(emptyList<Position>()) { acc, geometry -> acc + geometry.coordAll() }

@ExperimentalTurfApi
public fun Feature.coordAll(): List<Position>? = geometry?.coordAll()

@ExperimentalTurfApi
public fun FeatureCollection.coordAll(): List<Position> =
    features.fold(emptyList<Position>()) { acc, feature -> acc + (feature.coordAll() ?: emptyList()) }
