package com.haydikodlayalım;
import com.haydikodlayalım.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class application {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    public static void main(String[] args) {
        SpringApplication.run(application.class,args);



    }
}
