package com.jahidkhan.hello_api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// @RestController tells Spring that this class will handle web requests.
@RestController
class HelloWorldController {

    // @GetMapping("/hello") tells Spring to run this function
    // when someone accesses the "/hello" URL.
    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World! My first API is working. A different me starts here. A dream starts here."
    }
}