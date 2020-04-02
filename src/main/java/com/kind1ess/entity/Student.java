package com.kind1ess.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class Student {

    private Long id;
    private String name;
    private int age;
    private int score;
    private Date birthday;
}
