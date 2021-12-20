package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Grafik")
public class Grafik {
    @Id
    @Column(name = "Grafik ID")
    private Long grafik_Id;

    @Column(name = "Dane Pracownika ID")
    private Long dane_Pracownika_Id;

    @Column(name = "Data rozpoczecia")
    private java.sql.Date data_Rozpoczecia;

    @Column(name = "Data Zakonczenia")
    private java.sql.Date data_Zakonczenia;

    @Column(name = "Zmiana")
    private Boolean zmiana;

    public Long getGrafik_Id() {
        return grafik_Id;
    }

    public void setGrafik_Id(Long grafik_Id) {
        this.grafik_Id = grafik_Id;
    }

    public Long getDane_Pracownika_Id() {
        return dane_Pracownika_Id;
    }

    public void setDane_Pracownika_Id(Long dane_Pracownika_Id) {
        this.dane_Pracownika_Id = dane_Pracownika_Id;
    }

    public Date getData_Rozpoczecia() {
        return data_Rozpoczecia;
    }

    public void setData_Rozpoczecia(Date data_Rozpoczecia) {
        this.data_Rozpoczecia = data_Rozpoczecia;
    }

    public Date getData_Zakonczenia() {
        return data_Zakonczenia;
    }

    public void setData_Zakonczenia(Date data_Zakonczenia) {
        this.data_Zakonczenia = data_Zakonczenia;
    }

    public Boolean getZmiana() {
        return zmiana;
    }

    public void setZmiana(Boolean zmiana) {
        this.zmiana = zmiana;
    }

    @Override
    public String toString() {
        return "Grafik{" +
                "grafik_Id=" + grafik_Id +
                ", dane_Pracownika_Id=" + dane_Pracownika_Id +
                ", data_Rozpoczecia=" + data_Rozpoczecia +
                ", data_Zakonczenia=" + data_Zakonczenia +
                ", zmiana=" + zmiana +
                '}';
    }
}
