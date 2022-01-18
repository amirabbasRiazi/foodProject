package com.project.food.controller;

import com.project.food.model.Member;
import com.project.food.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(@RequestBody Member member) {
        return new ResponseEntity<>(memberService.addMember(member) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }


    @PutMapping("/update")
    public ResponseEntity<Object> updateUser(@RequestBody Member member) {
        return new ResponseEntity<>(memberService.updateMember(member) ? HttpStatus.OK : HttpStatus.CONFLICT);
    }








}
