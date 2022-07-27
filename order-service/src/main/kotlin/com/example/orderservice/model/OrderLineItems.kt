package com.example.orderservice.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "order_line_items")
data class OrderLineItems(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    var skyCode: String = "",
    var price: BigDecimal = BigDecimal.ZERO,
    var quantity: Int = 0,
)
