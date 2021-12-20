package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Dane pracownika")
public class Dane_pracownika {
    @Id
    @Column(name = "Dane Pracownika ID")
    private Long dane_Pracownika_Id;

    @Column(name = "Osoba ID")
    private Long osoba_Id;

    @Column(name = "Pesel")
    private double pesel;

    @Column(name = "Stanowisko")
    private String stanowisko;

    @Column(name = "Data zatrudnienia")
    private java.sql.Date data_Zatrudnienia;



    public Long getDane_Pracownika_Id() {
        return this.dane_Pracownika_Id;
    }

    public void setDane_Pracownika_Id(Long dane_Pracownika_Id) {
        this.dane_Pracownika_Id = dane_Pracownika_Id;
    }

    public Long getOsoba_Id() {
        return this.osoba_Id;
    }

    public void setOsoba_Id(Long osoba_Id) {
        this.osoba_Id = osoba_Id;
    }

    public double getPesel() {
        return this.pesel;
    }

    public void setPesel(double pesel) {
        this.pesel = pesel;
    }

    public String getStanowisko() {
        return this.stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public java.sql.Date getData_Zatrudnienia() {
        return this.data_Zatrudnienia;
    }

    public void setData_Zatrudnienia(java.sql.Date data_Zatrudnienia) {
        this.data_Zatrudnienia = data_Zatrudnienia;
    }

    @Override
    public String toString() {
        return "Dane_pracownika{" +
                "dane_Pracownika_Id=" + dane_Pracownika_Id +
                ", osoba_Id=" + osoba_Id +
                ", pesel=" + pesel +
                ", stanowisko='" + stanowisko + '\'' +
                ", data_Zatrudnienia=" + data_Zatrudnienia +
                '}';
    }
}

