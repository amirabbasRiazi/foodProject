package com.project.food.controller;

import com.project.food.model.Dessert;
import com.project.food.model.Food;
import com.project.food.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping(path = "/addDessert")
    public ResponseEntity<Object> addDessert(@RequestBody Dessert dessert) {
        return new ResponseEntity<>(foodService.addDessert(dessert) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }

    @PostMapping(path = "/addFood")
    public ResponseEntity<Object> addFood(@RequestBody Food food) {
        return new ResponseEntity<>(foodService.addFood(food) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }
}
