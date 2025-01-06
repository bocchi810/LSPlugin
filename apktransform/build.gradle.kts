plugins {
    kotlin("jvm")
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
    signing
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

version = "1.3"

kotlin {
    jvmToolchain(21)
}

dependencies {
    compileOnly(libs.agp)
}

publish {
    githubRepo = "bocchi810/LSPlugin"
    publishPlugin("$group.apktransform", "apktransform", "top.haoming9245.lsplugin.ApktransformPlugin") {
        name = "ApkTransform"
        description = "Transform apk"
        url = "https://github.com/bocchi810/LSPlugin"
        licenses {
            license {
                name = "Apache License 2.0"
                url = "https://github.com/bocchi810/LSPlugin/blob/master/LICENSE.txt"
            }
        }
        developers {
            developer {
                name = "LSPosed & bocchi810"
                url = "https://lsposed.org"
            }
        }
        scm {
            connection = "scm:git:https://github.com/bocchi810/LSPlugin.git"
            url = "https://github.com/bocchi810/LSPlugin"
        }
    }
}
