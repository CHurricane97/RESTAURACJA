package com.bd2pr.BD.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Stolik")
public class Stolik {
    @Id
    @Column(name = "Stolik ID")
    private Long stolik_Id;

    @Column(name = "Status")
    private String status;

    @Column(name = "Ilosc miejsc")
    private Long ilosc_Miejsc;

    public Stolik() {
    }



    public Long getStolik_Id() {
        return stolik_Id;
    }

    public void setStolik_Id(Long stolik_Id) {
        this.stolik_Id = stolik_Id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIlosc_Miejsc() {
        return ilosc_Miejsc;
    }

    public void setIlosc_Miejsc(Long ilosc_Miejsc) {
        this.ilosc_Miejsc = ilosc_Miejsc;
    }

    @Override
    public String toString() {
        return "Stolik{" +
                "stolik_Id=" + stolik_Id +
                ", status='" + status + '\'' +
                ", ilosc_Miejsc=" + ilosc_Miejsc +
                '}';
    }
}
