package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
