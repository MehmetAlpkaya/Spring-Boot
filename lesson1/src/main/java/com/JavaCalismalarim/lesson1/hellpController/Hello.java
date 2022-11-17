package com.JavaCalismalarim.lesson1.hellpController;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class Hello
{
//localhost:8080/hello
    //GET   :  Veri görüntülemek istediğimiz zaman kullanılır.                @GetMapping
    //POST  :  Veri kaydedilmek istendiği zaman kullanılır.                   @PostMapping
    //PUT   :  Veri güncellemek için kullanılır.                              @PutMapping
    //PATCH :  Verinin bir bölümünü güncelemek istediğimiz zaman kullanıyoruz @PatchMapping
    //         ör: parola güncelem istediğimiz zaman
    //DELETE : Veri silmek istediğimiz zaman kullanıyoruz                     @DeleteMapping
    //@GetMapping(path = "/hello")
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello()
    {
        return "Hello World!";
    }
    @RequestMapping(path = "/save" , method = RequestMethod.POST)
    public String save()
    {
        return "Data saved";
    }
    @DeleteMapping(path = "/delete")
    public String delete()
    {
        return "Data deleted!";
    }
    @GetMapping(path = "/message/{message}")
    public String getMyMessages(@PathVariable String message   )
    {
        return "Your mesage is : "+ message;
    }
    //@RequestBody Anotasyonu kullanıcıdan obje şeklinde bir veri okuyabildiğimiz bir anotasyondur
}
