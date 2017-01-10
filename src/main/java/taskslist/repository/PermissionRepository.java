package taskslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taskslist.entity.Permission;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findByUserid(long userid);
}
