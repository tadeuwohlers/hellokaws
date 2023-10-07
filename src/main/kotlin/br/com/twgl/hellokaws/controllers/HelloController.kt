package br.com.twgl.hellokaws.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("api/v1/hello")
@RestController
class HelloController {

    @GetMapping
    fun hello(): String {
        return "Hello World"
    }
}