package com.project.food.service.Impl;

import com.project.food.domain.Food;
import com.project.food.domain.Member;
import com.project.food.model.Purchase;
import com.project.food.service.FoodService;
import com.project.food.service.MemberService;
import com.project.food.service.PurchaseService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private FoodService foodService;

    private MemberService memberService;

    @Override
    public void purchase(Purchase purchase) {
        Food food = foodService.find(purchase.getFoodName());
        Member member = memberService.findMember(purchase.getUser_id());
        member.getFoods().add(food);
        memberService.updateMember(member);
    }


}
