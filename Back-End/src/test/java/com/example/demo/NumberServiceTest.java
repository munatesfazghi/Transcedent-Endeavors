package com.example.demo;

import com.example.demo.dtos.NumberDTO;
import com.example.demo.entity.NumberEntity;
import com.example.demo.repository.NumberRepository;
import com.example.demo.service.NumberServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NumberServiceTest {

    @Mock
    private NumberRepository numberRepository;

    @InjectMocks
    private NumberServiceImpl numberService;

    @Test
    public void testSaveNumber_ShouldCalculateCorrectValues() {

        NumberDTO inputDTO = new NumberDTO(5);
        NumberEntity expectedEntity = new NumberEntity();
        expectedEntity.setOriginalNumber(5);
        expectedEntity.setMultipliedBy2(10);
        expectedEntity.setSquaredResult(100);

        when(numberRepository.save(Mockito.any(NumberEntity.class))).thenReturn(expectedEntity);




        NumberDTO resultDTO = numberService.saveNumber(inputDTO);

        Mockito.verify(numberRepository).save(any(NumberEntity.class));

        assertEquals(expectedEntity.getOriginalNumber(), resultDTO.getOriginalNumber());
        assertEquals(expectedEntity.getMultipliedBy2(), resultDTO.getMultipliedBy2());
        assertEquals(expectedEntity.getSquaredResult(), resultDTO.getSquaredResult());
    }

}
