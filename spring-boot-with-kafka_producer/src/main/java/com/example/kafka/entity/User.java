package com.example.kafka.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Khairul Islam Azam
 * @created 23/04/2021 - 1:49 PM
 * @project kafka producer
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;

}
