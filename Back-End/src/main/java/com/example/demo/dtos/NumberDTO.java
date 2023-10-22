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

    public NumberDTO(double originalNumber) {
        this.originalNumber = originalNumber;
    }

    private double squaredResult;



}

