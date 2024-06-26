package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    Product milk(){
        return new Beverage("초코우유", 2000, 500);
    }

    @Bean
    public Product water(){
        return new Beverage("에비앙", 50000, 500);
    }


    /*  필기.
         singleton: 기본적인 스코프는 싱글톤!!
     *              하나의 인스턴스만을 생성을 하고, 모든 빈이 해당 인스턴스를 공유한다.
     * */

    /* singleton - prototype
    *   singleton : hashcode 같음 (하나의 인스턴트에 모든 빈이 들어가 있다.)
    *   prototype : hashcode 다름 (매번 새로운 인스턴트 생성 - 객체생성에 대한 부담감이 줄어든다.)
    * */

    @Bean
    @Scope("singleton")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

}
