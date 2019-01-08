/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 * 
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user guide at https://docs.gradle.org/5.0/userguide/multi_project_builds.html
 */

apply {
    plugin("settings-plugin")
}
pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.github.ben-manes.versions") {
                useModule("com.github.ben-manes:gradle-versions-plugin:${extensions.get("versions-plugin-version")}")
            }
        }
    }
}
rootProject.name = "setttings-plugin-props"