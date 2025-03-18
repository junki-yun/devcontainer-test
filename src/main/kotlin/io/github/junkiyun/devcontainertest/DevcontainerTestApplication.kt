package io.github.junkiyun.devcontainertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevcontainerTestApplication

fun main(args: Array<String>) {
    runApplication<DevcontainerTestApplication>(*args)
}
