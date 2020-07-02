package com.springadmin.springadmin.controller;

import com.springadmin.springadmin.helper.Key;
import com.springadmin.springadmin.model.Queue;
import com.springadmin.springadmin.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class QueueController {

    @Autowired
    QueueRepository queueRepository;

    @GetMapping("/queue")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Queue> getAllQueue() {
        return queueRepository.findAll();
    }

    @RequestMapping(value = "/queue/{merchant_id}/{user_id}",method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:3000")
    public void deleteFromQueue(@PathVariable(name = "merchant_id") String merchant_id, @PathVariable(name = "user_id") String user_id) {
        Key k = new Key();
        k.setMerchant_id(Long.parseLong(merchant_id));
        k.setUser_id(Long.parseLong(user_id));
        queueRepository.deleteById(k);

    }

}
