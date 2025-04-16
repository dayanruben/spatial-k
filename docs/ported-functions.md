# Ported Functions

The following functions have been ported as of version `0.2.0` of this library.

## Measurement

- [x] [`along`](../api/turf/turf/com.dayanruben.spatialk.turf/along/)
- [x] [`area`](../api/turf/turf/com.dayanruben.spatialk.turf/area/)
- [x] [`bbox`](../api/turf/turf/com.dayanruben.spatialk.turf/bbox/)
- [x] [`bboxPolygon`](../api/turf/turf/com.dayanruben.spatialk.turf/bbox-polygon/)
- [x] [`bearing`](../api/turf/turf/com.dayanruben.spatialk.turf/bearing/)
- [x] [`center`](../api/turf/turf/com.dayanruben.spatialk.turf/center/)
- [ ] `centerOfMass`
- [x] [`destination`](../api/turf/com.dayanruben.spatialk.turf/destination/)
- [x] [`distance`](../api/turf/com.dayanruben.spatialk.turf/distance/)
- [ ] `envelope`
- [x] [`length`](../api/turf/turf/com.dayanruben.spatialk.turf/length/)
- [x] [`midpoint`](../api/turf/turf/com.dayanruben.spatialk.turf/midpoint/)
- [ ] `pointOnFeature`
- [ ] `polygonTangents`
- [ ] `pointToLineDistance`
- [ ] `rhumbBearing`
- [ ] `rhumbDestination`
- [ ] `rhumbDistance`
- [ ] `square`
- [ ] `greatCircle`

## Coordinate Mutation

- [ ] `cleanCoords`
- [ ] `flip`
- [ ] `rewind`
- [x] `round`  
Use `round` or `Math.round` from the standard library instead.
- [ ] `truncate`

## Transformation

- [ ] `bboxClip`
- [ ] `bezierSpline`
- [ ] `buffer`
- [ ] `circle`
- [ ] `clone`
- [ ] `concave`
- [ ] `convex`
- [ ] `difference`
- [ ] `dissolve`
- [ ] `intersect`
- [ ] `lineOffset`
- [ ] `simplify`
- [ ] `tessellate`
- [ ] `transformRotate`
- [ ] `transformTranslate`
- [ ] `transformScale`
- [ ] `union`
- [ ] `voronoi`

## Feature Conversion

- [ ] `combine`
- [ ] `explode`
- [ ] `flatten`
- [ ] `lineToPolygon`
- [ ] `polygonize`
- [ ] `polygonToLine`

## Miscellaneous

- [ ] `kinks`
- [ ] `lineArc`
- [ ] `lineChunk`
- [x] [`lineIntersect`](../api/turf/turf/com.dayanruben.spatialk.turf/line-intersect/)
  Partially implemented.
- [ ] `lineOverlap`
- [ ] `lineSegment`
- [x] [`lineSlice`](../api/turf/turf/com.dayanruben.spatialk.turf/line-slice/)
- [ ] `lineSliceAlong`
- [ ] `lineSplit`
- [ ] `mask`
- [x] [`nearestPointOnLine`](../api/turf/turf/com.dayanruben.spatialk.turf/nearest-point-on-line/)
- [ ] `sector`
- [ ] `shortestPath`
- [ ] `unkinkPolygon`

## Helper

Use the [GeoJson DSL](../geojson/#geojson-dsl) instead.

## Random

- [ ] `randomPosition`
- [ ] `randomPoint`
- [ ] `randomLineString`
- [ ] `randomPolygon`

## Data

- [ ] `sample`

## Interpolation

- [ ] `interpolate`
- [ ] `isobands`
- [ ] `isolines`
- [ ] `planepoint`
- [ ] `tin`

## Joins

- [ ] `pointsWithinPolygon`
- [ ] `tag`

## Grids

- [ ] `hexGrid`
- [ ] `pointGrid`
- [x] [`squareGrid`](../api/turf/turf/com.dayanruben.spatialk.turf/squareGrid/)
- [ ] `triangleGrid`

## Classification

- [ ] `nearestPoint`

## Aggregation

- [ ] `collect`
- [ ] `clustersDbscan`
- [ ] `clustersKmeans`

## Meta

- [ ] `coordAll`
- [ ] `coordEach`
- [ ] `coordReduce`
- [ ] `featureEach`
- [ ] `featureReduce`
- [ ] `flattenEach`
- [ ] `flattenReduce`
- [ ] `getCoord`
- [ ] `getCoords`
- [ ] `getGeom`
- [ ] `getType`
- [ ] `geomEach`
- [ ] `geomReduce`
- [ ] `propEach`
- [ ] `segmentEach`
- [ ] `segmentReduce`
- [ ] `getCluster`
- [ ] `clusterEach`
- [ ] `clusterReduce`

## Assertations

- [ ] `collectionOf`
- [ ] `containsNumber`
- [ ] `geojsonType`
- [ ] `featureOf`

## Booleans

- [ ] `booleanClockwise`
- [ ] `booleanContains`
- [ ] `booleanCrosses`
- [ ] `booleanDisjoint`
- [ ] `booleanEqual`
- [ ] `booleanOverlap`
- [ ] `booleanParallel`
- [x] [`booleanPointInPolygon`](../api/turf/turf/com.dayanruben.spatialk.turf/boolean-point-in-polygon/)
- [ ] `booleanPointOnLine`
- [ ] `booleanWithin`

## Unit Conversion

- [x] [`bearingToAzimuth`](../api/turf/turf/com.dayanruben.spatialk.turf/bearing-to-azimuth/)
- [x] [`convertArea`](../api/turf/turf/com.dayanruben.spatialk.turf/convert-area/)
- [x] [`convertLength`](../api/turf/turf/com.dayanruben.spatialk.turf/convert-length/)
- [ ] `degreesToRadians`
- [x] [`lengthToRadians`](../api/turf/turf/com.dayanruben.spatialk.turf/length-to-radians/)
- [x] [`lengthToDegrees`](../api/turf/turf/com.dayanruben.spatialk.turf/length-to-degrees/)
- [x] [`radiansToLength`](../api/turf/turf/com.dayanruben.spatialk.turf/radians-to-length/)
- [ ] `radiansToDegrees`
- [ ] `toMercator`
- [ ] `toWgs84`