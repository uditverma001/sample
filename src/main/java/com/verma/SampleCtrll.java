package com.verma;

import com.verma.learning.pojo.Book;
import com.verma.learning.services.DbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleCtrll {
    public Logger logger = LoggerFactory.getLogger(SampleCtrll.class);

    @Autowired
    private DbService dbService;

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> get(@RequestBody Book book) {
        dbService.insertBook(book);
        return ResponseEntity.ok("book saved :" + book.getName());
    }

    @GetMapping(path = "/getbooks")
    public ResponseEntity<List<Book>> get5(@RequestParam("author_id") long id) {
        logger.info("db service instance hashcode is {}", dbService.hashCode());

        List<Book> books = dbService.getBooksByAuthor(id);


        return ResponseEntity.ok(books);
    }

    @GetMapping(path = "/b")
    public ResponseEntity<String> get1(@RequestParam("dame") String name) {
        return ResponseEntity.ok(" bhajle  you :" + name);
    }

    @GetMapping(path = "/c")
    public ResponseEntity<String> get2(@RequestParam("name") String name) {
        return ResponseEntity.ok("nice to meet you :" + name);
    }

    @GetMapping(path = "/d")
    public ResponseEntity<String> get3(@RequestParam("name") String name) {
        return ResponseEntity.ok("nice to meet you :" + name);
    }

    @GetMapping(path = "/e")
    public ResponseEntity<String> get4(@RequestParam("name") String name) {
        return ResponseEntity.ok("nice to meet you :" + name);
    }
}
