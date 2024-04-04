package com.ohgiraffers.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("dao")   // bean 이라고 알려주는것
public class MemberDAO {
    // 데이터 베이스에 들어갈 객체 만들기

    private final Map<Integer, MemberDTO> memberMap;

    // 초기화
    public MemberDAO(){
        this.memberMap = new HashMap<>();

        this.memberMap.put(1, new MemberDTO(1,"user01", "pass01", "이도아"));
        this.memberMap.put(2, new MemberDTO(2,"user02", "pass02", "홍길동"));
    }

    public MemberDTO findMemberBySequence(int sequence){

        return memberMap.get(sequence);
    }

    public boolean save(MemberDTO member){

        int before = memberMap.size();

        memberMap.put(member.getSequence(),member);

        int after = memberMap.size();

        return after > before? true : false;


    }
}
