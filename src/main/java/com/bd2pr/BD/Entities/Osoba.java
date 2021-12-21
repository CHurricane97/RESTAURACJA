package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Osoba")
public class Osoba {
    @Id
    @Column(name = "Osoba ID")
    private Long osoba_Id;

    @Column(name = "Imie")
    private String imie;

    @Column(name = "Nazwisko")
    private String nazwisko;

    @Column(name = "Numer Telefonu")
    private double numer_Telefonu;

    @Column(name = "Login")
    private String login;

    @Column(name = "Haslo")
    private String haslo;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, double numer_Telefonu, String login, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_Telefonu = numer_Telefonu;
        this.login = login;
        this.haslo = haslo;
    }

    public Long getOsoba_Id() {
        return this.osoba_Id;
    }

    public void setOsoba_Id(Long osoba_Id) {
        this.osoba_Id = osoba_Id;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getNumer_Telefonu() {
        return this.numer_Telefonu;
    }

    public void setNumer_Telefonu(double numer_Telefonu) {
        this.numer_Telefonu = numer_Telefonu;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return this.haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "osoba_Id=" + osoba_Id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer_Telefonu=" + numer_Telefonu +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                '}';
    }
}
