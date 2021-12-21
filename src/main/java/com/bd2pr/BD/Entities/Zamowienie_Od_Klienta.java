package com.bd2pr.BD.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Zamowienie od klienta")
public class Zamowienie_Od_Klienta {
    @Id
    @Column(name = "Zamowienie klienta ID")
    private Long zamowienie_Klienta_Id;

    @Column(name = "Menu ID")
    private Long menu_Id;

    @Column(name = "Stolik ID")
    private Long stolik_Id;

    @Column(name = "Klient ID")
    private Long klient_Id;

    @Column(name = "Data")
    private java.sql.Date data;

    @Column(name = "Na miejscu")
    private Boolean na_Miejscu;

    @Column(name = "Status")
    private String status;

    @Column(name = "Opis")
    private String opis;

    public Zamowienie_Od_Klienta() {
    }



    public Long getZamowienie_Klienta_Id() {
        return zamowienie_Klienta_Id;
    }

    public void setZamowienie_Klienta_Id(Long zamowienie_Klienta_Id) {
        this.zamowienie_Klienta_Id = zamowienie_Klienta_Id;
    }

    public Long getMenu_Id() {
        return menu_Id;
    }

    public void setMenu_Id(Long menu_Id) {
        this.menu_Id = menu_Id;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getNa_Miejscu() {
        return na_Miejscu;
    }

    public void setNa_Miejscu(Boolean na_Miejscu) {
        this.na_Miejscu = na_Miejscu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Zamowienie_Od_Klienta{" +
                "zamowienie_Klienta_Id=" + zamowienie_Klienta_Id +
                ", menu_Id=" + menu_Id +
                ", stolik_Id=" + stolik_Id +
                ", klient_Id=" + klient_Id +
                ", data=" + data +
                ", na_Miejscu=" + na_Miejscu +
                ", status='" + status + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
