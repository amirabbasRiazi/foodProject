package com.project.food.service.Impl;

import com.project.food.model.Dessert;
import com.project.food.model.Food;
import com.project.food.repository.FoodRepository;
import com.project.food.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    @Override
    public Boolean addFood(Food food) {
        Food saved = foodRepository.save(food);
        return saved != null;
    }


}
