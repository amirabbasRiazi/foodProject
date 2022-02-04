package com.project.food.repository;

import com.project.food.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.charset.MalformedInputException;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

    Member findMemberById(Long id);

}
