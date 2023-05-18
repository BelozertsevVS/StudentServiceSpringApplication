package com.ua.robot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private int id;
    private String surname;
    private int age;
    private String groupID;
}
