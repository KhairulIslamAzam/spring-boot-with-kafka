package com.example.kafka.controller;

import com.example.kafka.entity.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Khairul Islam Azam
 * @created 23/04/2021 - 3:26 PM
 * @project kafka consumer
 */
@RestController
@RequestMapping("/api")
public class UserConsumerController {

//    @GetMapping("/user")
//    public String getUserMap(User user){
//        return getUser(user);
//    }
    @KafkaListener(topics = "myTopic")
    public void getUser(User user) {
        System.out.println("your name is: " + user.getFirstName() + " " + user.getLastName());
    }
}
