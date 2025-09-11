plugins {
    alias(libs.plugins.shadow) // Shadow plugin for creating fat JARs
}

allprojects {
    group = "example.plugin"
    version = "1.0.0"
    description = "An example template for creating Minecraft plugins"

    repositories {
        mavenLocal() // Local Maven repository
        mavenCentral() // Central Maven repository
    }
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "com.gradleup.shadow")

    tasks.named("build") { dependsOn("shadowJar") } // Include shadowJar in the build lifecycle
}