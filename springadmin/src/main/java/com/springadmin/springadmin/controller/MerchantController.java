package com.springadmin.springadmin.controller;

import com.springadmin.springadmin.model.Merchant;
import com.springadmin.springadmin.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController

public class MerchantController {

    @Autowired
    private MerchantRepository merchantRepository;

    @GetMapping("/merchant")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Merchant> getAllMerchant(){
        return merchantRepository.findAll();
    }
    @GetMapping("/merchant/{merchant_id}")
    public Optional<Merchant> getMerchantById(@PathVariable(value = "merchant_id") Long merchantId){
        Optional<Merchant> merchant = merchantRepository.findById(merchantId);
        return merchant;
    }


}

