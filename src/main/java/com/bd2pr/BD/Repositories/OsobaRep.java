package com.bd2pr.BD.Repositories;

import com.bd2pr.BD.Entities.Osoba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsobaRep extends JpaRepository<Osoba, Long> {



}
