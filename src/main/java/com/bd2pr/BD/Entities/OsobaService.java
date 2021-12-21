package com.bd2pr.BD.Entities;


import com.bd2pr.BD.Repositories.OsobaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class OsobaService {
    private final OsobaRep osobaRep;
@Autowired
    public OsobaService(OsobaRep osobaRep) {
        this.osobaRep = osobaRep;
    }

//    List<Osoba>{
//    return osobaRep.findAll();
//    }
//
//    public Long policz(){
//    return osobaRep.count();
//    }
}
