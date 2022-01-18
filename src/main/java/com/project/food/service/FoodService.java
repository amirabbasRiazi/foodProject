package com.project.food.service;

import com.project.food.model.Dessert;
import com.project.food.model.Food;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface FoodService {

    Boolean addFood(Food food);

    List<Food> findAll();

}
