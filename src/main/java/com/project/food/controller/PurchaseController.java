package com.project.food.controller;

import com.project.food.model.Purchase;
import com.project.food.service.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {


    private PurchaseService purchaseService;


    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }


    @PostMapping("/purchase")
    public ResponseEntity<Object> purchase(@RequestBody Purchase purchase) {
        purchaseService.purchase(purchase);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
