package com.verma.learning.db_repo;

import com.verma.learning.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepo extends JpaRepository<Book, Long> {


    @Query(nativeQuery = true,value ="select * from books where author_id=?1" )
    List<Book> getBooksByAuthorId(long id);
}
