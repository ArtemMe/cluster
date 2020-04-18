package com.artemme.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/hello")
    fun sayHello(@RequestParam(value="name") name: String): String {
        return "Hello $name"
    }
}
