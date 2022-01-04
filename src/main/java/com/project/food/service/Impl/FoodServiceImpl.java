package com.project.food.service.Impl;

import com.project.food.model.Dessert;
import com.project.food.model.Food;
import com.project.food.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService {


    @Override
    public Boolean addDessert(Dessert dessert) {
        return true;
    }

    @Override
    public Boolean addFood(Food food) {
        return true;
    }


}
