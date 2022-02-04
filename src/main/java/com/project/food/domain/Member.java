package com.project.food.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String firstname;

    @Column(name = "family")
    private String lastname;

    @Column(name = "taghziyeno")
    private String identityNo;

    @Column(name = "memberNo")
    private String memberNo;

    @Column(name = "details")
    private String details;

    @Column(name = "startdate")
    private String createdDate;

    @Column(name = "enddate")
    private String expiredDate;

    @ManyToOne
    private MemberType memtype;

    @ManyToOne
    private Gender gender;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Food> foods;


    public List<Food> getFoods() {
        if (foods == null)
            this.foods = new ArrayList<>();
        return foods;
    }

}
