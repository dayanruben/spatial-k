[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.20-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Gradle](https://img.shields.io/badge/Gradle-8.13-blue?logo=gradle)](https://gradle.org)
[![Maven Central Version](https://img.shields.io/maven-central/v/com.dayanruben.spatialk)](https://central.sonatype.com/namespace/com.dayanruben.spatialk)
[![License](https://img.shields.io/github/license/dayanruben/spatial-k)](https://github.com/dayanruben/spatial-k/blob/main/LICENSE)

# Spatial K

Spatial K is a set of libraries for working with geospatial data in Kotlin including an implementation of GeoJson and 
a port of Turfjs written in pure Kotlin. It supports Kotlin Multiplatform and Java projects while also featuring a 
Kotlin DSL for building GeoJson objects.

See the [project site](https://dayanruben.github.io/spatial-k) for more info.

## Installation

#### Java and Kotlin/JVM

```kotlin
dependencies {
    implementation("com.dayanruben.spatialk:geojson:0.4.0")
    implementation("com.dayanruben.spatialk:turf:0.4.0")
}
```

#### Kotlin Multiplatform
```kotlin
commonMain {
    dependencies {
        implementation("com.dayanruben.spatialk:geojson:0.4.0")
        implementation("com.dayanruben.spatialk:turf:0.4.0")
    }
}
```
