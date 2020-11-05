package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.UserApiService
import org.fedyiv.otus.dao.UserRepository
import org.fedyiv.otus.dao.model.toWebModel
import org.fedyiv.otus.model.User
import org.springframework.stereotype.Service


@Service
class UserApiServiceImpl(private val repository: UserRepository) : UserApiService {


    override fun createUser(user: User) : User {

        return repository.save(
            org.fedyiv.otus.dao.model.User(
                username = user.username,
                firstName = user.firstName,
                lastName = user.lastName,
                email = user.email,
                phone = user.phone
            )
        ).toWebModel()

    }

    override fun deleteUser(userId: Long) {
        repository.deleteById(userId)
    }

    override fun findUserById(userId: Long): User {
        return repository.findById(userId).get().toWebModel()
    }

    override fun updateUser(userId: Long, user: User?) {

        repository.save(
            org.fedyiv.otus.dao.model.User(
                id = userId,
                username = user!!.username,
                firstName = user!!.firstName,
                lastName = user!!.lastName,
                email = user!!.email,
                phone = user!!.phone
            )
        )
    }
}