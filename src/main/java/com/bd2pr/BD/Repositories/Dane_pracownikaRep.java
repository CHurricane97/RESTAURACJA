package com.bd2pr.BD.Repositories;

import com.bd2pr.BD.Entities.Dane_pracownika;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dane_pracownikaRep extends JpaRepository<Dane_pracownika, Long> {
}
