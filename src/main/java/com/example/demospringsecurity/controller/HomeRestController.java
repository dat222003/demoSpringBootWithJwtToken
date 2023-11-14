package com.example.demospringsecurity.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class HomeRestController {

    @GetMapping("home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok().body("secured content");
    }


}
