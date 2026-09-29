plugins {
    id("java")
}

group = "com.katok"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }

    maven {
        name = "spigot-repo"
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }

    maven {
        name = "placeholderapi"
        url = uri("https://repo.extendedclip.com/releases/")
    }
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.48")
    annotationProcessor("org.projectlombok:lombok:1.18.48")

    compileOnly("com.google.dagger:dagger:2.60.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.60.1")

    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.11.7")
}