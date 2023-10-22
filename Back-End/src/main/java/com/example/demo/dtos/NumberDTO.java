package com.example.demo.dtos;


import com.example.demo.NumberProApplication;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NumberDTO {
    private double originalNumber;
    private double multipliedBy2;
    private double squaredResult;

}

