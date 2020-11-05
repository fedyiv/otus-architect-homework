package org.fedyiv.otus.dao


import org.fedyiv.otus.dao.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, Long> {
}