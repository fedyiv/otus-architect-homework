package org.fedyiv.otus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(
    basePackages = ["org.fedyiv.otus.invoker", "org.fedyiv.otus.api",
        "org.fedyiv.otus.model", "org.fedyiv.otus.web.services","org.fedyiv.otus"]
)
class UserService

fun main(args: Array<String>) {
    SpringApplication.run(UserService::class.java, *args)
}

