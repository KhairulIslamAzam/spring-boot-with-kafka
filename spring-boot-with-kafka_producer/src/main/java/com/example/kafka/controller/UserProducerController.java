package com.example.kafka.controller;

import com.example.kafka.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author Khairul Islam Azam
 * @created 23/04/2021 - 2:22 AM
 * @project kafka producer
 */
@RestController
@RequestMapping("/api")
public class UserProducerController {
    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;

    @PostMapping("/user")
    public void getUser(@RequestBody User user){
        kafkaTemplate.send("myTopic", user);
    }
}
