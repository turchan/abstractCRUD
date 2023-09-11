package com.example.demo.service;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.common.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CarService extends AbstractService<Car, CarRepository> {

    public CarService(CarRepository repository) {
        super(repository);
    }
}