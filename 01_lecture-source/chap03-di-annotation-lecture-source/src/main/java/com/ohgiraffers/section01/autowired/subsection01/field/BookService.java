package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
/* @Component 의 세분화 어노테이션으로 Service 계층에서 사용된다. */
@Service("ServiceField")
public class BookService {

    // private BookDAO = new BookDAO.BookDAOImpl;   // 원래 이렇게 생성


    /* BookDAO 타입의 Bean(객체)를 이 프로퍼티에 자동으로 주입해준다.  => @Autowired 자동으로 찾아준다*/
    @Autowired
    private BookDAO bookDAO;  // DAO 필드에 의존성 주입 (DAO 인터페이스에 실제 작동하는 class 가져온다)
    // final 사용 할수 없다 => final 붙이면 직접 생성을 하기 떄문에 @Autowired 사용할 필요가 없다.
    // 값 추적하기 어렵다.
    // new 를 안쓰는 이유는 은닉 => DAO 를 상속받은 DAOImpl 를 굳이 쓰지 않아도 찾아 가고 있다.

    // DAO 메소드 호출

    /* 전체조회 호출 */
    public List<BookDTO> selectAllBooks(){

        // bookDAO = new BookDAOImpl;

        return bookDAO.selectBookList();

    }

    /* 번호로 책  하나 조회 */
    public BookDTO searchBookBySequence(int sequence){

        return bookDAO.selectOneBook(sequence);
    }


}
