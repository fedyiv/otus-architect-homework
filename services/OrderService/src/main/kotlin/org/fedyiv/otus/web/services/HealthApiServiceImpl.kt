package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.HealthApiService
import org.springframework.stereotype.Service

@Service
class HealthApiServiceImpl: HealthApiService {
    override fun getHealth(): String {
        return " {\"status\": \"OK\"}"
    }
}