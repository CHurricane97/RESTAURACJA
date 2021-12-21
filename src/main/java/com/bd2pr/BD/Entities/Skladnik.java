package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Skladnik")
public class Skladnik {
    @Id
    @Column(name = "Skladnik ID")
    private Long skladnik_Id;

    @Column(name = "Nazwa")
    private String nazwa;

    public Skladnik() {
    }

    public Skladnik(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getSkladnik_Id() {
        return this.skladnik_Id;
    }

    public void setSkladnik_Id(Long skladnik_Id) {
        this.skladnik_Id = skladnik_Id;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Skladnik{" +
                "skladnik_Id=" + skladnik_Id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
