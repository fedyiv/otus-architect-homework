package org.fedyiv.otus

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping(value = ["/health"], produces = ["application/json"])
    fun getHealth():String {
        return " {\"status\": \"OK\"}"
    }
}