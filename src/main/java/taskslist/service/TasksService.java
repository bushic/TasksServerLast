package taskslist.service;

import taskslist.entity.Lists;
import taskslist.entity.Permission;
import taskslist.entity.Task;
import taskslist.entity.User;

import java.util.List;


public interface TasksService {
    List<User> getAllUsers();
    User getUserByID(long id);
    User getUserByLogin(String login);
    User saveUser(User user);
    void removeUser(long id);

    List<Lists> getAllLists();
    Lists getListByID(long id);
    Lists saveList(Lists lists);
    void removeList(long id);

    List<Task> getAllTasks();
    Task getTaskByID(long id);
    List<Task> getTasksByListID(long listid);
    Task saveTask(Task task);
    void removeTask(long id);

    List<Permission> getAllPermissions();
    Permission getPermissionByID(long id);
    Permission savePermission(Permission permission);
    void removePermission(long id);
    List<Permission> getPermissionsByUserID(long userid);
}
