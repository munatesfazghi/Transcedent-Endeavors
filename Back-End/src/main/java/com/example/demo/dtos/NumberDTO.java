package com.example.demo.dtos;


import com.example.demo.NumberProApplication;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NumberDTO {
    private double originalNumber;
    private double multipliedBy2;
    private double squaredResult;

}

