plugins {
    id("java")
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.22.0")
    testImplementation("org.mockito:mockito-core:4.8.0")
}

tasks.test {
    finalizedBy("jacocoTestReport")
    useJUnitPlatform()

    jacoco {
        excludes += "org/example/shoppingcart/Item.*"
    }
}
