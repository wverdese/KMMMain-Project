pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMMMainProject"
include(":androidApp")
include(":shared")

// declare kmmLibraryProject as the root folder of another Gradle project that the main project depends on
includeBuild("kmmLibraryProject") {
    // expose :lib module as an artifact, so that it can be imported in the main project
    dependencySubstitution {
        substitute(module("me.wverdese:lib")).using(project(":lib"))
    }
}
