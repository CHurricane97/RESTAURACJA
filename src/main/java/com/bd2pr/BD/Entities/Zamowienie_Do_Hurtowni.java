package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Zamowienie do hurtowni")
public class Zamowienie_Do_Hurtowni {
    @Id
    @Column(name = "Zamowienie do hurtowni ID")
    private Long zamowienie_Do_Hurtowni_Id;

    @Column(name = "Skladnik ID")
    private Long skladnik_Id;

    @Column(name = "Ilosc")
    private Long ilosc;

    @Column(name = "Data")
    private java.sql.Date data;

    public Zamowienie_Do_Hurtowni() {
    }



    public Long getZamowienie_Do_Hurtowni_Id() {
        return zamowienie_Do_Hurtowni_Id;
    }

    public void setZamowienie_Do_Hurtowni_Id(Long zamowienie_Do_Hurtowni_Id) {
        this.zamowienie_Do_Hurtowni_Id = zamowienie_Do_Hurtowni_Id;
    }

    public Long getSkladnik_Id() {
        return skladnik_Id;
    }

    public void setSkladnik_Id(Long skladnik_Id) {
        this.skladnik_Id = skladnik_Id;
    }

    public Long getIlosc() {
        return ilosc;
    }

    public void setIlosc(Long ilosc) {
        this.ilosc = ilosc;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Zamowienie_Do_Hurtowni{" +
                "zamowienie_Do_Hurtowni_Id=" + zamowienie_Do_Hurtowni_Id +
                ", skladnik_Id=" + skladnik_Id +
                ", ilosc=" + ilosc +
                ", data=" + data +
                '}';
    }
}
