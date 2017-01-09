package taskslist.service;

import taskslist.entity.User;

import java.util.List;

public interface TasksService {
    List<User> getAllUsers();
    User getUserByID(long id);
    User saveUser(User user);
    void removeUser(long id);
}
