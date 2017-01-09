package taskslist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskslist.entity.User;
import taskslist.repository.UserRepository;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService{

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByID(long id) {
        return userRepository.findOne(id);
    }

    public User saveUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void removeUser(long id) {
        userRepository.delete(id);
    }
}
