package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* 필기. 생성자를 통한 주입 => 생성자를 통해 초기화를 해서 오류가 없다.(장점)*/
@Service("ServiceConstructor")
public class BookService {

    /* 필기.
        <장점>
    *   1. 필드 주입은 의존성이 있는 객체가 생성되지 않아도 객체의 생성이 가능하다.
    *   따라서 메소드가 호출 될 때(런타임) 오류가 발생하게 된다.
    *   생성자 주입은 의존성이 있는 객체가 생성되지 않으면
    *   객체의 생성이 불가능하여 어플리케이션 실행 시점에 오류가 발생한다.
    *   2. 필드에 final 키워드를 사용할 수 있기 떄문에 객체의 생성 이후 ㅜ
            의존성을 변경할 수 없어 안정성이 보장된다.
        3. 코드 가독성이 좋다(하나의 () 안에 묶어놓는다 ex
         private final BookDAO bookDAO; 초기화 하고
         public BookService(BookDAO bookDAO, BookDAO bookDAO2)
         )) -> 이렇게 여러개 묶을 수 있다.
         => 단일화 => 한개의 클라스는 하나만 받는게 좋다.
    *
    * */

    private final BookDAO bookDAO;

    // 생성자릏 통한 초기화 => final 쓸수 있기 때문에 객체에 대한 안정성 보장
    @Autowired
    public BookService(BookDAO bookDAO){

        this.bookDAO = bookDAO;

    }

    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();

    }

    public BookDTO searchBookBySequence(int sequence){

        return bookDAO.selectOneBook(sequence);
    }
}
