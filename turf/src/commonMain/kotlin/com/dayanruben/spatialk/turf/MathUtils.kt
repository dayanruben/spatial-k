@file:Suppress("MagicNumber")

package com.dayanruben.spatialk.turf

import kotlin.math.PI

internal fun degrees(radians: Double) = radians * 180.0 / PI
internal fun radians(degrees: Double) = degrees * PI / 180.0
