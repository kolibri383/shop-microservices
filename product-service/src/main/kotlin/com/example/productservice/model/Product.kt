package com.example.productservice.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@Document(value="product")
data class Product (
    @Id
    val id: ObjectId = ObjectId.get(),
    var name: String = "",
    var description: String = "",
    var price: BigDecimal = BigDecimal.ZERO,
)