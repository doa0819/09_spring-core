package com.ohgiraffers.section02.initdestroy.subsection01.java;

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


    /* 필기.
    *   prototype : getBean() 시에 매번 새로운 인스턴스를 생성하게 해준다.
    * */

    /* singleton - prototype
     *   singleton : hashcode 같음 (하나의 인스턴트에 모든 빈이 들어가 있다.)
     *   prototype : hashcode 다름 (매번 새로운 인스턴트 생성 - 객체생성에 대한 부담감이 줄어든다.)
     * */

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner(){

        return new Owner();
    }

}
