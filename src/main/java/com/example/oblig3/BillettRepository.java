package com.example.oblig3;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(billett innBilletter){
        String sql = "INSERT INTO billett (film,antall,fornavn,etternavn,tlf,Epost) VALUES (?,?,?,?,?,?)";
        db.update(sql,innBilletter.getFilm(),innBilletter.getAntall(),innBilletter.getFornavn(),innBilletter.getEtternavn(),innBilletter.getTlf(),innBilletter.getEpost());
    }

    public List<billett> hentAlleBilletter(){
        String sql = "SELECT * FROM billett";
        List<billett> alleBilletter = db.query(sql,new BeanPropertyRowMapper(billett.class));
        return alleBilletter;
    }

    public void slettAlleBilletter(){
        String sql = "DELETE FROM billett";
        db.update(sql);
    }

}
