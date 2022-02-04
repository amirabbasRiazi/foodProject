package com.project.food.controller;

import com.project.food.domain.Food;
import com.project.food.service.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @PostMapping(path = "/add")
    public ResponseEntity<Object> addFood(@RequestBody Food food) {
        return new ResponseEntity<>(foodService.addFood(food) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }

    @GetMapping(path = "/all")
    public List<Food> findAll() {
        return foodService.findAll();
    }

    @GetMapping(path = "/find")
    public ResponseEntity<Food> findFood(@PathParam(value = "name") String name) {
        return new ResponseEntity<>(foodService.find(name),HttpStatus.ACCEPTED);
    }



}
