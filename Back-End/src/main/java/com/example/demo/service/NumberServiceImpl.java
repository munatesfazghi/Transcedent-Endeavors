package com.example.demo.service;

import com.example.demo.dtos.NumberDTO;
import com.example.demo.entity.NumberEntity;
import com.example.demo.repository.NumberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NumberServiceImpl implements NumberService {
    private final NumberRepository numberRepository;

    @Override
    public NumberDTO saveNumber(NumberDTO numberDTO) {
        NumberEntity numberEntity = new NumberEntity();
        numberEntity.setOriginalNumber(numberDTO.getOriginalNumber());
        numberEntity.setMultipliedBy2(numberDTO.getOriginalNumber() * 2);
        numberEntity.setSquaredResult(Math.pow(numberDTO.getOriginalNumber() * 2, 2));

        NumberEntity savedEntity = numberRepository.save(numberEntity);

        return convertToDTO(savedEntity);
    }

    private NumberDTO convertToDTO(NumberEntity numberEntity) {
        return NumberDTO
                .builder()
                .originalNumber(numberEntity.getOriginalNumber())
                .multipliedBy2(numberEntity.getMultipliedBy2())
                .squaredResult(numberEntity.getSquaredResult())
                .build();
    }
}

