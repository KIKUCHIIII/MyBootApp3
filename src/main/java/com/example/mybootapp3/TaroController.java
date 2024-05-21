package com.example.mybootapp3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
