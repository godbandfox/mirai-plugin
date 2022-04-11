plugins {
    val kotlinVersion = "1.5.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.10.1"
}

group = "com.fxy"
version = "0.1"
dependencies {
    
}
repositories {

    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}
