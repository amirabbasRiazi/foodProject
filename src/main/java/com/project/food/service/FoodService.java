package com.project.food.service;

import com.project.food.model.Dessert;
import com.project.food.model.Food;

public interface FoodService {
    Boolean addDessert(Dessert dessert);

    Boolean addFood(Food food);
}
