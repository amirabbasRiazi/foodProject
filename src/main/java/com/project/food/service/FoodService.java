package com.project.food.service;

import com.project.food.domain.Food;

import java.util.List;

public interface FoodService {

    Boolean addFood(Food food);

    Food find(String name);

    List<Food> findAll();

}
