package quiz.debug.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz.debug.web.entity.Book;
import quiz.debug.web.repository.BookRepository;
import quiz.debug.web.repository.UserRepository;

@Service
public class BookService {
  @Autowired
  BookRepository bookRepository;
  UserRepository userRepository;

  public String addBook(Book book) {
    Book saved = bookRepository.save(book);
    return saved.getId();
  }
}
