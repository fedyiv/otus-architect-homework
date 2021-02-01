package org.fedyiv.otus.web.services

import org.fedyiv.otus.api.OrderApiService
import org.fedyiv.otus.dao.OrderRepository
import org.fedyiv.otus.dao.model.toWebModel
import org.fedyiv.otus.model.Order
import org.springframework.stereotype.Service


@Service
class OrderApiServiceImpl(private val repository: OrderRepository) : OrderApiService {


    override fun createOrder(order: Order, xminusAuthMinusRequestMinusEmail: String?): Order {

        if(!xminusAuthMinusRequestMinusEmail.equals(order.email))
            throw IllegalAccessError("Unauthorized")

        return repository.save(
            org.fedyiv.otus.dao.model.Order(
                price = order.price,
                email = order.email,
                accountId = order.accountId
            )
        ).toWebModel()

    }


    override fun findOrderById(orderId: Long, xminusAuthMinusRequestMinusEmail: String?): Order {
        val order = repository.findById(orderId).get()
        if(!xminusAuthMinusRequestMinusEmail.equals(order.email))
            throw IllegalAccessError("Unauthorized")
        return order.toWebModel()
    }

}