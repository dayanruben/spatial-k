import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.publish) apply false
    alias(libs.plugins.dokka)
}

rootProject.plugins.withType<NodeJsPlugin> {
    the<NodeJsEnvSpec>().apply {
        version.set("20.11.1")
    }
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaMultiModuleTask>().configureEach {
    outputDirectory.set(rootDir.absoluteFile.resolve("docs/api"))
    moduleName.set("Spatial K")

    pluginsMapConfiguration.set(
        mapOf(
            "org.jetbrains.dokka.base.DokkaBase" to """
            {
                "footerMessage": "Copyright &copy; 2025 Derek Ellis",
                "customStyleSheets": ["${file("docs/css/logo-styles.css").invariantSeparatorsPath}"]
            }
        """.trimIndent()
        )
    )
}
