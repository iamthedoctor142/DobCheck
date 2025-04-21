package com.example.stringchecker.controller;

import com.example.stringchecker.service.StringService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/strings")
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/inputString")
    public String getName(@RequestParam String inputString) {
        return stringService.findNameByInputString(inputString);
    }
}