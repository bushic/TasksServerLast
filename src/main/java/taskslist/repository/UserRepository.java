package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLogin(String login);

}
