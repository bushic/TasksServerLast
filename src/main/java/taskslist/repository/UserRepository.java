package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
