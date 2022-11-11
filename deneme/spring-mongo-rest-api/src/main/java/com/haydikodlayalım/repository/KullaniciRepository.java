package com.haydikodlayalım.repository;

import com.haydikodlayalım.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> //Kullanıcı nesnesinden string tipiyle çalışır
{


}
