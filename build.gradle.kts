// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Google.build_gradle)
        classpath(Jetbrains.kotlin_gradle)
        classpath(Google.hilt_gradle)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}