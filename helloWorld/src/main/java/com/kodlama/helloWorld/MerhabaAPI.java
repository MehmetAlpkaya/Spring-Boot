package com.kodlama.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class MerhabaAPI {
    @GetMapping
    public String merhaba()
    {

        return "Merhaba";
    }
}
