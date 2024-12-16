plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
    }
    addTestListener(object : TestListener {
        override fun beforeTest(descriptor: TestDescriptor) {
            println("beforeTest ")
        }

        override fun afterTest(descriptor: TestDescriptor, result: TestResult) {
            println(" afterTest  ")
        }

        override fun beforeSuite(suite: TestDescriptor) {
            println("beforeSuite ")
        }

        override fun afterSuite(suite: TestDescriptor, result: TestResult) {
            println("afterSuite ")
        }
    })
}
