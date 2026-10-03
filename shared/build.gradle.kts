plugins {
    kotlin("multiplatform")
}

kotlin {
    androidLibrary {
        namespace = "com.snackceo.reframe.shared"
        compileSdk = 36
    }

    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
