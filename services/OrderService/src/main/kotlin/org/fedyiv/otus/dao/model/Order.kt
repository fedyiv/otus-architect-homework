package org.fedyiv.otus.dao.model


import javax.persistence.*

@Entity
@Table(name = "order_table")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val orderId: Long = 0,
    val email: String? = "",
    val price: Long? = null,
    val accountId: Long? = null
)

fun Order.toWebModel(): org.fedyiv.otus.model.Order =
    org.fedyiv.otus.model.Order(
        orderId = this.orderId,
        email = this.email,
        price = this.price,
        accountId = this.accountId
    )
