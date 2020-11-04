package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.UserApiService
import org.fedyiv.otus.model.User
import org.springframework.stereotype.Service


@Service
class UserApiServiceImpl : UserApiService {
    override fun createUser(user: User) {
        TODO("Not yet implemented")
    }

    override fun deleteUser(userId: Long) {
        TODO("Not yet implemented")
    }

    override fun findUserById(userId: Long): User {
        TODO("Not yet implemented")
    }

    override fun updateUser(userId: Long, user: User?) {
        TODO("Not yet implemented")
    }
}