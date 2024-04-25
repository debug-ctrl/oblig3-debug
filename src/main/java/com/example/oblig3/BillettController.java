package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillettController {
     @Autowired
     private BillettRepository repo;



    @PostMapping("/lagre")
    public void lagreBillett(billett innBilletter){
        repo.lagreBillett(innBilletter);
    }

    @PostMapping("/hentAlleBilletter")
    public List <billett> hentAlle() {
        return repo.hentAlleBilletter();
    }

    @PostMapping("/slettBilletter")
    public void slettAlle(){
        repo.slettAlleBilletter();
    }

}
