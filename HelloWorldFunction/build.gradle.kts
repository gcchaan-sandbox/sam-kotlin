plugins {
    kotlin("jvm") version "1.3.72"
    application
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    jcenter()
}

application {
    mainClassName = "helloworld.App"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.amazonaws", "aws-lambda-java-core", "1.2.1")
    implementation("com.amazonaws", "aws-lambda-java-events", "3.6.0")
//    testImplementation 'junit:junit:4.13.1'
}
