package com.example.demo.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

@Repository
@Data
@Accessors
public class User {
    private String name;
    private Integer age;
}
