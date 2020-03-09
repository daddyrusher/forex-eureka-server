package com.daddyrusher.forexeurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ForexEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<ForexEurekaServerApplication>(*args)
}
