package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Urlopy")
public class Urlopy {
    @Id
    @Column(name = "Urlop ID")
    private Long urlop_Id;

    @Column(name = "Dane Pracownika ID")
    private Long dane_Pracownika_Id;

    @Column(name = "Data rozpoczecia")
    private java.sql.Date data_Rozpoczecia;

    @Column(name = "Data Zakonczenia")
    private java.sql.Date data_Zakonczenia;

    @Column(name = "Status")
    private String status;

    public Urlopy() {
    }

    public Urlopy(Long dane_Pracownika_Id, Date data_Rozpoczecia, Date data_Zakonczenia, String status) {
        this.dane_Pracownika_Id = dane_Pracownika_Id;
        this.data_Rozpoczecia = data_Rozpoczecia;
        this.data_Zakonczenia = data_Zakonczenia;
        this.status = status;
    }

    public Long getUrlop_Id() {
        return urlop_Id;
    }

    public void setUrlop_Id(Long urlop_Id) {
        this.urlop_Id = urlop_Id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Urlopy{" +
                "urlop_Id=" + urlop_Id +
                ", dane_Pracownika_Id=" + dane_Pracownika_Id +
                ", data_Rozpoczecia=" + data_Rozpoczecia +
                ", data_Zakonczenia=" + data_Zakonczenia +
                ", status='" + status + '\'' +
                '}';
    }
}
