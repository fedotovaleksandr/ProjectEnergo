package com.projectenergo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aleksandr on 11.02.2016.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
