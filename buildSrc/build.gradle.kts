plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("LSPlugin") {
            id = "LSPlugin"
            implementationClass = "top.haoming9245.lsplugin.PublishPlugin"
        }
    }
}

sourceSets {
    main {
        kotlin {
            srcDir("../publish/src/main/kotlin")
        }
    }
}

dependencies {
    implementation(kotlin("gradle-plugin", "2.1.0"))
}
