package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.Lists;

public interface ListRepository extends JpaRepository<Lists, Long> {
}
