package com.project.food.service.Impl;

import com.project.food.model.Member;
import com.project.food.repository.MemberRepository;
import com.project.food.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public Boolean addMember(Member member) {
        Member saved =  memberRepository.save(member);
        return saved != null;
    }

    @Override
    public Boolean updateMember(Member member) {
        return null;
    }
}
