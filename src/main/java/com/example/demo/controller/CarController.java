package com.example.demo.controller;

import com.example.demo.controller.common.AbstractController;
import com.example.demo.domain.Car;
import com.example.demo.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController extends AbstractController<Car, CarService> {

    public CarController(CarService service) {
        super(service);
    }
}