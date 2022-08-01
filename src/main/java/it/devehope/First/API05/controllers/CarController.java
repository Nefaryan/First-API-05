package it.devehope.First.API05.controllers;

import it.devehope.First.API05.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public CarDTO createCar(){
        CarDTO car = new CarDTO("A458","F458 Italia",345000.00);
        return car;

    }

    @PostMapping
    public String postCar(@Valid @RequestBody CarDTO car){
        System.out.println(car.toString());
        return "Car created";
    }


}
