package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Skladnik - Menu")
public class Skladnik_Menu {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Skladnik ID")
    private Long skladnik_Id;

    @Column(name = "Menu ID")
    private Long menu_Id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkladnik_Id() {
        return skladnik_Id;
    }

    public void setSkladnik_Id(Long skladnik_Id) {
        this.skladnik_Id = skladnik_Id;
    }

    public Long getMenu_Id() {
        return menu_Id;
    }

    public void setMenu_Id(Long menu_Id) {
        this.menu_Id = menu_Id;
    }

    @Override
    public String toString() {
        return "Skladnik_Menu{" +
                "id=" + id +
                ", skladnik_Id=" + skladnik_Id +
                ", menu_Id=" + menu_Id +
                '}';
    }
}
