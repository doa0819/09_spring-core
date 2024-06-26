package com.ohgiraffers.section01.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.*;

//@Component
/*@Component 의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용*/
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
    // Impl => BookDAO 상속 받았다는 의미

    private final Map<Integer, BookDTO> bookList;   // final 사용으로 꼭  초기화 시켜줘야함

    public BookDAOImpl(){

        // 생성자로 초기화 시킴
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123456, "혼자공부하는자바", "이도아", "한빛출판", new Date()));
        bookList.put(2, new BookDTO(2, 654321, "혼자공부하는자바2", "이도아2", "한빛출판2", new Date()));

    }

    @Override
    public List<BookDTO> selectBookList() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }

}
