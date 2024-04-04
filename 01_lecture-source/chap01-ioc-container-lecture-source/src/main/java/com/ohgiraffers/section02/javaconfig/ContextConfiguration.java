package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    // java 코드로 bean 으로 직접 등록
    @Bean
    public MemberDTO getMember (){

        return new MemberDTO(1,"user01","pass01","이도아");
    }
}
