package com.project.food.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Getter
@Setter
@Entity
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gendertitle")
    private String title;


    @OneToMany(mappedBy = "gender")
    private Collection<Member> members = new ArrayList<>();

}
