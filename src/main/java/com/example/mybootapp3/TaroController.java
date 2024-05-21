package com.example.mybootapp3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Test

@RestController
public class TaroController {
        @RequestMapping("/")
        public String index() {
            return "Hello, Spring Boot!";
        }
        @RequestMapping("/taro")
        public String taro() {
            return "Taro desu!";
        }
}
