package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
