package quiz.debug.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.debug.web.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
