package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.DebugApiService
import org.fedyiv.otus.api.VersionApiService
import org.fedyiv.otus.model.Debug
import org.springframework.stereotype.Service

@Service
class DebugApiServiceImpl:DebugApiService {

    override fun debugGet(xminusAuthMinusRequestMinusEmail: String?): Debug {
        return  Debug(xAuthRequestEmail = xminusAuthMinusRequestMinusEmail)
    }
}