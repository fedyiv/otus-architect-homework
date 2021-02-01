package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.VersionApiService
import org.springframework.stereotype.Service

@Service
class VersionApiServiceImpl:VersionApiService {
    override fun getVersion(): String {
        return " {\"version\": \"2\"}"
    }
}