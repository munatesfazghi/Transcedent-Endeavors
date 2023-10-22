package com.example.demo.controller;



import com.example.demo.dtos.NumberDTO;
import com.example.demo.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/numbers")
@CrossOrigin(origins = "*")
public class NumberController {
    private final NumberService numberService;

    @PostMapping
    public NumberDTO saveNumber(@RequestBody NumberDTO numberDTO) {
        return numberService.saveNumber(numberDTO);
    }
}

