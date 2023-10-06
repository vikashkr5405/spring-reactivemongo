package com.vikash.springreactivemongo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Student
{
    @Id

    int id;
    String name;
    int age;
    String city;

}
