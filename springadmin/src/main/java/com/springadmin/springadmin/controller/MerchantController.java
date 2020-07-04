package com.springadmin.springadmin.controller;

import com.springadmin.springadmin.model.Merchant;
import com.springadmin.springadmin.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.sql.*;
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
    @GetMapping("/merchant/count/{merchant_id}")
    public int getMerchantWaitCount(@PathVariable(value = "merchant_id") String merchant_id) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        
        Class.forName("org.postgresql.Driver");
        String URL = "jdbc:postgresql://localhost:5432/demodb";
        String username = "rushildp";
        String password = "aarya2006";
        try {
            connection = DriverManager.getConnection(URL,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        assert connection != null;
        Statement sql = connection.createStatement();
        String query = "select count from (SELECT merchant_id ,count(user_id) as count from queue group by merchant_id) as foo where merchant_id = "+Integer.parseInt(merchant_id);
        assert sql != null;
        ResultSet resultSet = sql.executeQuery(query);
        resultSet.next();
        int result  = resultSet.getInt("count");
        System.out.println(result);
        return result;
    }



}

