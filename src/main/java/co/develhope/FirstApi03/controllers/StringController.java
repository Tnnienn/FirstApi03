package co.develhope.FirstApi03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("strings")
public class StringController {

    @GetMapping
    public String getString(@RequestParam String s1, @RequestParam(required = false, defaultValue = "") String s2) {
        return s1 + s2;
    }
}
