package org.fedyiv.otus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(
    basePackages = ["org.fedyiv.otus.invoker", "org.fedyiv.otus.api",
        "org.fedyiv.otus.model", "org.fedyiv.otus.web.services","org.fedyiv.otus"]
)
class OrderService

fun main(args: Array<String>) {
    SpringApplication.run(OrderService::class.java, *args)
}

