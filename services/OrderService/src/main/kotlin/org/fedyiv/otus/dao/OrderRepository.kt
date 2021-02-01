package org.fedyiv.otus.dao


import org.fedyiv.otus.dao.model.Order
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: CrudRepository<Order, Long> {
}