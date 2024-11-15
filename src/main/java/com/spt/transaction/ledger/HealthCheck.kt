package com.spt.transaction.ledger

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {

    @GetMapping("/healthcheck")
    fun healthCheck(): String {
        return "project running succesfully"
    }
}