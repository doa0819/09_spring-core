package com.ohgiraffers.section03.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers")   // com.ohgiraffers 이 안에 있는 것들을 등록을 해줄거야(실제로 등록하지 않아도 어노테이션으로 등록함)
public class ContextConfiguration {



}
