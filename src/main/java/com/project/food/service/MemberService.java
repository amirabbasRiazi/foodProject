package com.project.food.service;

import com.project.food.domain.Member;

public interface MemberService {

    Boolean addMember(Member member);

    Boolean updateMember(Member member);

    Member findMember(Long id);
}
