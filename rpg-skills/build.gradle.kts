group = "cc.mewcraft.nova"
version = "1.0.0"

plugins {
    alias(libs.plugins.kotlin)
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.xenondevs.xyz/releases")
}

dependencies {
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
}
