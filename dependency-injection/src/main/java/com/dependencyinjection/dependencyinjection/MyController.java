package com.dependencyinjection.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    @Autowired //IoC Container içinde bulunan nesneler deüişkenler içine atanacak
    private firstClass firstClass;
    @Autowired
    private SecondClass secondClass;

    @GetMapping(path = "/first-class")
    public String getNameOfFirstClass()
    {
        return firstClass.getName();
    }

    @GetMapping(path = "/second-class")
    public String getNameOfSecondClass()
    {
        return secondClass.getName();
    }
}
