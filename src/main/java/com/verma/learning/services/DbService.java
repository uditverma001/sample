package com.verma.learning.services;


import com.verma.learning.db_repo.BooksRepo;
import com.verma.learning.pojo.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    public Logger logger= LoggerFactory.getLogger(DbService.class);

    @Autowired
    private BooksRepo booksRepo;

    public boolean insertBook(Book book) {

        booksRepo.save(book);

        return false;
    }

    public List<Book> getBooksByAuthor(long id) {
        logger.info("api called for author for id {}",id);

        List<Book> books = booksRepo.getBooksByAuthorId(id);
        return books;
    }
}
