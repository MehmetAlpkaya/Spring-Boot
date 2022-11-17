package com.dependencyinjection.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Bean //Proje ayağa kalkarken Bean anotasyonu görülecek metod çağırılacak oluşturulan nesne IoC container içine aktarılacak
	public SecondClass getSecondClass()
	{
		return new SecondClass();
	}
}
