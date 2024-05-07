package com.emmanuele.Esercizio2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping(path = "/name/")
    public String returnName(@RequestParam String name) {
        return name;
    }

    @PostMapping(path = "/name/")
    public String returnReverseName(@RequestParam String name) {
        return ReverseName.toString(name);
    }

}
