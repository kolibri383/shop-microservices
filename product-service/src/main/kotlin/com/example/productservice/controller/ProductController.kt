package com.example.productservice.controller

import com.example.productservice.model.Product
import com.example.productservice.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/product")
class ProductController(
    @Autowired
    val productRepository: ProductRepository
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAll(): MutableList<Product> =
        productRepository.findAll()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createProduct(@RequestBody product: Product ){
        productRepository.save(product)
    }

}