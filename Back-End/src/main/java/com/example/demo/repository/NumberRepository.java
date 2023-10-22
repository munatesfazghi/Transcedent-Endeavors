package com.example.demo.repository;


import com.example.demo.entity.NumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NumberRepository extends JpaRepository<NumberEntity , Long> {


}
