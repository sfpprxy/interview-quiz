package quiz.debug.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quiz.debug.web.entity.User;
import quiz.debug.web.repository.BookRepository;
import quiz.debug.web.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  BookRepository bookRepository;
  UserRepository userRepository;

  public User get(String id) {
    User user = userRepository.findById(id).get();
    return user;
  }
}
