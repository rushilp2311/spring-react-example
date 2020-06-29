package com.springadmin.springadmin.controller;

import com.springadmin.springadmin.model.Queue;
import com.springadmin.springadmin.repository.QueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueueController {

    @Autowired
    QueueRepository queueRepository;

    @GetMapping("/queue")
    public List<Queue> getAllQueue(){
        return queueRepository.findAll();
    }
}
