package com.bd2pr.BD;

import com.bd2pr.BD.Entities.Osoba;
import com.bd2pr.BD.Repositories.Dane_pracownikaRep;
import com.bd2pr.BD.Repositories.OsobaRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bd2v4Application {

    public static void main(String[] args) {
        SpringApplication.run(Bd2v4Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(Dane_pracownikaRep dane_pracownikaRep, OsobaRep osobaRep){
//return args -> {
//    Osoba newperson=new Osoba();
//    //Long a= osobaRep.count();
//    newperson.Osobaseteverything("Patrycja","Bodnar",123456789,"fryz","haslo");
//    newperson.setOsoba_Id((long) 101);
//    osobaRep.save(newperson);
//
//    System.out.println(newperson.getOsoba_Id()+"  "+newperson.getImie()+ "  ");

//};
//
//
//    }

}
