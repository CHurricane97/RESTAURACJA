package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Pozycja w menu")
public class Pozycja_w_menu {
    @Id
    @Column(name = "Menu ID")
    private Long menu_Id;

    @Column(name = "Nazwa")
    private String nazwa;

    @Column(name = "Cena")
    private Long cena;

    public Pozycja_w_menu() {
    }

    public Pozycja_w_menu(String nazwa, Long cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Long getMenu_Id() {
        return menu_Id;
    }

    public void setMenu_Id(Long menu_Id) {
        this.menu_Id = menu_Id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Pozycja_W_Menu{" +
                "menu_Id=" + menu_Id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
