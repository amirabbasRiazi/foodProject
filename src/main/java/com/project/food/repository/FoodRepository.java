package com.project.food.repository;

import com.project.food.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {
}
