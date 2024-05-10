package com.emmanuele.Esercizio2;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.web.bind.annotation.RestController

public class RestController {
    @Operation(summary = "Return the name")
    @GetMapping(path = "/name/")
    public String returnName(@RequestParam String name) {
        return name;
    }
    @Operation(summary = "Return the reverse of the name")
    @PostMapping(path = "/name/")
    public String returnReverseName(@RequestParam String name) {
        return ReverseName.toString(name);
    }

}
