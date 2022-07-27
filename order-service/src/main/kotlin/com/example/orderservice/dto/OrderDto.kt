package com.example.orderservice.dto

import com.example.orderservice.model.OrderLineItems

data class OrderDto(
    val orderLineItems: OrderLineItems
)