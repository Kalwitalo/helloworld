package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloRestController {
    @GetMapping
    public ResponseEntity<String> buscarTodos() {
        return ResponseEntity.ok("HelloWorld");
    }
}
