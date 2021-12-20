package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Dane klienta")
public class Dane_Klienta {
    @Id
    @Column(name = "Klient ID")
    private Long klient_Id;

    @Column(name = "Osoba ID")
    private Long osoba_Id;

    @Column(name = "Adres zamieszkania ID")
    private Long adres_Zamieszkania_Id;


    public Long getKlient_Id() {
        return klient_Id;
    }

    public void setKlient_Id(Long klient_Id) {
        this.klient_Id = klient_Id;
    }

    public Long getOsoba_Id() {
        return osoba_Id;
    }

    public void setOsoba_Id(Long osoba_Id) {
        this.osoba_Id = osoba_Id;
    }

    public Long getAdres_Zamieszkania_Id() {
        return adres_Zamieszkania_Id;
    }

    public void setAdres_Zamieszkania(Long adres_Zamieszkania) {
        this.adres_Zamieszkania_Id = adres_Zamieszkania;
    }

    @Override
    public String toString() {
        return "Dane_Klienta{" +
                "klient_Id=" + klient_Id +
                ", osoba_Id=" + osoba_Id +
                ", adres_Zamieszkania=" + adres_Zamieszkania_Id +
                '}';
    }
}

