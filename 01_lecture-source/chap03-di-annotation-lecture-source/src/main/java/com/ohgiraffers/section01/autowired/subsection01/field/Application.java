package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* 필기.
        *   @Autowired
        *   의존성을 주입하 때 사용되는 대표적인 어노테이션이다.
        *   의존성을 주입하는 방법은 3가지 방법이 있다.
        *   1. 필드 주입 - 20% 사용
        *   2. 생성자 주입 - 80% 사용
        *   3. setter 주입 - 거의X
        * */

        /* 필기. 필드에 주입*/

        // 어디서 부터 스캔을 할꺼냐 com.ohgiraffers.section01 하위에 있는 것들을 다 조회할꺼다
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        // 어플리케이션에서 서비스클라스 호출
        BookService service = context.getBean("ServiceField", BookService.class);

        /* 전체 도서 목록 조회하기 */
        List<BookDTO> books = service.selectAllBooks();
        for (BookDTO book : books){
            System.out.println("book = " + book);
        }
    }
}
