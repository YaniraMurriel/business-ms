package com.bcp.business.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/business/")
public class BusinessController {

    @GetMapping
    public ResponseEntity businessMethod() {
        return ResponseEntity.ok("HOLA MUNDO GET");
    }

    @PostMapping
    public ResponseEntity businessPostMethod() {
        return ResponseEntity.ok("HOLA MUNDO POST");
    }
}
