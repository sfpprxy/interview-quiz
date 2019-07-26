package quiz.debug.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.debug.web.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
