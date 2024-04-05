package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    // AnimalService 호출

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }  // 3개가 있는데 무엇을 가지고 올지 모르는 상태


        AnimalService animalService = context.getBean("animalPrimary", AnimalService.class);

        animalService.animalEat();
    }




}
