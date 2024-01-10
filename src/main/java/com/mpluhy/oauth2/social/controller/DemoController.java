package com.mpluhy.oauth2.social.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from non-secured endpoint");
    }

    @GetMapping("secret")
    public ResponseEntity<String> helloSecret(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
