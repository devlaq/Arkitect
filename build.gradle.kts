plugins {
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
}

group = "com.github.devlaq"
version = "1.0-dev"

repositories {
    mavenCentral()
    jcenter()
    maven (url = "https://www.jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))

    compileOnly("com.github.Anuken.Arc:arc-core:${properties["mindustryVersion"]}")
    compileOnly("com.github.Anuken.Mindustry:core:${properties["mindustryVersion"]}")
}