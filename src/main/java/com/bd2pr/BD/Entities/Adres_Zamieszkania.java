package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Adres zamieszkania")
public class Adres_Zamieszkania {



    @Id
    @Column(name = "Adres ID")
    private Long adres_Id;

    @Column(name = "Wojewodztwo")
    private String wojewodztwo;

    @Column(name = "Kraj")
    private String kraj;

    @Column(name = "Miasto")
    private String miasto;

    @Column(name = "Ulica")
    private String ulica;

    @Column(name = "Numer domu")
    private Long numer_Domu;

    @Column(name = "Numer lokalu")
    private Long numer_Lokalu;

    @Column(name = "Kod pocztowy")
    private String kod_Pocztowy;

    public Adres_Zamieszkania() {
    }



    public Long getAdres_Id() {
        return this.adres_Id;
    }

    public void setAdres_Id(Long adres_Id) {
        this.adres_Id = adres_Id;
    }

    public String getWojewodztwo() {
        return this.wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getKraj() {
        return this.kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getMiasto() {
        return this.miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return this.ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Long getNumer_Domu() {
        return this.numer_Domu;
    }

    public void setNumer_Domu(Long numer_Domu) {
        this.numer_Domu = numer_Domu;
    }

    public Long getNumer_Lokalu() {
        return this.numer_Lokalu;
    }

    public void setNumer_Lokalu(Long numer_Lokalu) {
        this.numer_Lokalu = numer_Lokalu;
    }

    public String getKod_Pocztowy() {
        return this.kod_Pocztowy;
    }

    public void setKod_Pocztowy(String kod_Pocztowy) {
        this.kod_Pocztowy = kod_Pocztowy;
    }

    @Override
    public String toString() {
        return "Adres_Zamieszkania{" +
                "adres_Id=" + adres_Id +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", kraj='" + kraj + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numer_Domu=" + numer_Domu +
                ", numer_Lokalu=" + numer_Lokalu +
                ", kod_Pocztowy='" + kod_Pocztowy + '\'' +
                '}';
    }
}

