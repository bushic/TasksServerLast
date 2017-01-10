package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.Lists;

import java.util.List;

public interface ListRepository extends JpaRepository<Lists, Long> {
    List<Lists> findById(long id);
}
