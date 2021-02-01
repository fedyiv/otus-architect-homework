package org.fedyiv.otus.dao.model


import javax.persistence.*

@Entity
@Table(name = "user_table")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val id: Long = 0,
    val username: String? = "",
    val firstName: String? = "",
    val lastName: String? = "",
    val email: String? = "",
    val phone: String? = "",
    val accountId: Long? = null
)

fun User.toWebModel(): org.fedyiv.otus.model.User =
    org.fedyiv.otus.model.User(
        id = this.id,
        username = this.username,
        firstName = this.firstName,
        lastName = this.lastName,
        email = this.lastName,
        phone = this.phone
    )
