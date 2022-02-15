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
include(":kmmLibraryProject:lib")
