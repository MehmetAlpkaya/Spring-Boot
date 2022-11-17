package com.JavaCalismalarim.lesson1.hellpController;

import com.JavaCalismalarim.lesson1.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class myController {
    @PostMapping(path = "/users")
    public User saveUser(@RequestBody User user)//Kullanıcı user modelini karşıılayan bir json gönderecek spring değişkene atayacak
    {
        System.out.println("User saved!");
        user.setPassword("");//password'u boş gönderdik
        return user;
    }
    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader )
    {
        return "your header is: " + myHeader;

    }
}
