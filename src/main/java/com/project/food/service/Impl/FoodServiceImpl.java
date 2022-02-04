package com.project.food.service.Impl;

import com.project.food.domain.Food;
import com.project.food.repository.FoodRepository;
import com.project.food.service.FoodService;
import com.project.food.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    private MemberService memberService;

    public FoodServiceImpl(FoodRepository foodRepository, MemberService memberService) {
        this.foodRepository = foodRepository;
        this.memberService = memberService;
    }


    @Override
    public Boolean addFood(Food food) {
        Food saved = foodRepository.save(food);
        return saved != null;
    }

    @Override
    public Food find(String name) {
        return foodRepository.findFoodByName(name);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

}
