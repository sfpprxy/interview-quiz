package quiz.debug.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import quiz.debug.web.entity.Book;
import quiz.debug.web.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping(value="/add")
    public String addBook(@RequestBody Book book) {
        String id = bookService.addBook(book);
        return id;
    }

}
