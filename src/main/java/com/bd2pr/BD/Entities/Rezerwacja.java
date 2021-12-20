package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Rezerwacja")
public class Rezerwacja {
    @Id
    @Column(name = "Rezerwacja ID")
    private Long rezerwacja_Id;

    @Column(name = "Stolik ID")
    private Long stolik_Id;

    @Column(name = "Klient ID")
    private Long klient_Id;

    @Column(name = "Data utworzenia")
    private java.sql.Date data_Utworzenia;

    @Column(name = "Data rezerwacji")
    private java.sql.Date data_Rezerwacji;

    public Long getRezerwacja_Id() {
        return rezerwacja_Id;
    }

    public void setRezerwacja_Id(Long rezerwacja_Id) {
        this.rezerwacja_Id = rezerwacja_Id;
    }

    public Long getStolik_Id() {
        return stolik_Id;
    }

    public void setStolik_Id(Long stolik_Id) {
        this.stolik_Id = stolik_Id;
    }

    public Long getKlient_Id() {
        return klient_Id;
    }

    public void setKlient_Id(Long klient_Id) {
        this.klient_Id = klient_Id;
    }

    public Date getData_Utworzenia() {
        return data_Utworzenia;
    }

    public void setData_Utworzenia(Date data_Utworzenia) {
        this.data_Utworzenia = data_Utworzenia;
    }

    public Date getData_Rezerwacji() {
        return data_Rezerwacji;
    }

    public void setData_Rezerwacji(Date data_Rezerwacji) {
        this.data_Rezerwacji = data_Rezerwacji;
    }

    @Override
    public String toString() {
        return "Rezerwacja{" +
                "rezerwacja_Id=" + rezerwacja_Id +
                ", stolik_Id=" + stolik_Id +
                ", klient_Id=" + klient_Id +
                ", data_Utworzenia=" + data_Utworzenia +
                ", data_Rezerwacji=" + data_Rezerwacji +
                '}';
    }
}
