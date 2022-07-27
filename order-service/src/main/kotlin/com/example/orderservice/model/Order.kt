package com.example.orderservice.model

import javax.persistence.*

@Entity
@Table(name = "t_orders")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    var orderNumber: String,
    @OneToMany(cascade = [CascadeType.ALL])
    var orderLineItems: List<OrderLineItems>
)