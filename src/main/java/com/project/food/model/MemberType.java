package com.project.food.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Entity
public class MemberType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "typename")
    private String typeName;

    @Column(name = "details")
    private String details;


    @Column(name = "member")
    @OneToMany(mappedBy = "memtype")
    private Collection<Member> members = new ArrayList<>();

}
