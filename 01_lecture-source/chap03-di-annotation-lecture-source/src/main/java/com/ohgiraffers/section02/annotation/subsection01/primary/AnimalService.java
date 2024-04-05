package com.ohgiraffers.section02.annotation.subsection01.primary;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.stereotype.Service;

@Service("animalPrimary")
public class AnimalService {

    // 생성자 주입
    private Animal animal;

    /* 생성자가 한개이면 @AutoWired 를 생략해도 알아서 주입해준다.*/

     public AnimalService(Animal animal){
        this.animal = animal;
     }

     public void animalEat(){
         animal.eat();
     }

}
