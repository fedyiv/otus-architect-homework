package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.UserApiService
import org.fedyiv.otus.dao.UserRepository
import org.fedyiv.otus.dao.model.toWebModel
import org.fedyiv.otus.model.User
import org.springframework.stereotype.Service


@Service
class UserApiServiceImpl(private val repository: UserRepository) : UserApiService {


    override fun createUser(user: User, xminusAuthMinusRequestMinusEmail: String?): User {

        if(!xminusAuthMinusRequestMinusEmail.equals(user.email))
            throw IllegalAccessError("Unauthorized")

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

    override fun deleteUser(userId: Long, xminusAuthMinusRequestMinusEmail: String?) {

        if(!xminusAuthMinusRequestMinusEmail.equals(repository.findById(userId).get().email))
            throw IllegalAccessError("Unauthorized")

        repository.deleteById(userId)
    }

    override fun findUserById(userId: Long, xminusAuthMinusRequestMinusEmail: String?): User {
        val user = repository.findById(userId).get()
        if(!xminusAuthMinusRequestMinusEmail.equals(user.email))
            throw IllegalAccessError("Unauthorized")
        return user.toWebModel()
    }

    override fun updateUser(userId: Long, xminusAuthMinusRequestMinusEmail: String?, user: User?) {

        val existingUser = repository.findById(userId).get()
        if(!xminusAuthMinusRequestMinusEmail.equals(existingUser.email))
            throw IllegalAccessError("Unauthorized")

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