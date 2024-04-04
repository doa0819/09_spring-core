package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//설정 정보라는것을 알려줌
public class ContextConfiguration {

    @Bean
    public Account account(){

        return new PersonalAccount(10,"123-1234-12341234");      // xml 파일에서 bean 태그 클래스 속성 초기화 한거 그대로 한것

    }



    @Bean
    public MemberDTO member(){


        /* 생성자를 통한 주입 */
//        return new MemberDTO(1,"이도아","010-1232-1234","leedoa0819@gmail.com",account());  // 생성자 로 만들어쥼-> 위에 account 같이 생성

        /* setter 주입*/
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("이도아");
        member.setPhone("010-1234-1234");
        member.setEmail("leedoa0819@gmail.com");
        member.setPersonalAccount(account());   // 한명 회워에 대한 계좌번호 까지 들어가게 된다.

        return member;

    }

}
