package com.fooder.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/")
    public Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Fooder API Server");
        response.put("status", "running");
        return response;
    }
}
