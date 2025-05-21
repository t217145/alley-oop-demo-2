package com.hkjc.alleyoop.cicd.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping({"","/", "/index"})
    public DemoResponse index(@RequestParam(required = false, name = "name") String name) {
        return new DemoResponse(String.format("Welcome to Alley OOP {%s}", name == null ? "anonymous" : name), "DEMO-002");
    }
}