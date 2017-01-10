package taskslist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskslist.entity.Lists;
import taskslist.entity.Permission;
import taskslist.entity.Task;
import taskslist.entity.User;
import taskslist.repository.ListRepository;
import taskslist.repository.PermissionRepository;
import taskslist.repository.TaskRepository;
import taskslist.repository.UserRepository;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private PermissionRepository permissionRepository;

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

    public User getUserByLogin(String login) {
        return userRepository.findByLogin(login).get(0);
    }


    public List<Lists> getAllLists() {
        return listRepository.findAll();
    }

    public Lists getListByID(long id) {
        return listRepository.findOne(id);
    }

    public Lists saveList(Lists lists) {
        return listRepository.saveAndFlush(lists);
    }

    public void removeList(long id) {
        listRepository.delete(id);
    }



    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskByID(long id) {
        return taskRepository.findOne(id);
    }

    public List<Task> getTasksByListID(long listid) {
        return taskRepository.findByListid(listid);
    }

    public Task saveTask(Task task) {
        return taskRepository.saveAndFlush(task);
    }

    public void removeTask(long id) {
        taskRepository.delete(id);
    }



    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public Permission getPermissionByID(long id) {
        return permissionRepository.findOne(id);
    }

    public List<Permission> getPermissionsByUserID(long userid) {
        return permissionRepository.findByUserid(userid);
    }

    public Permission savePermission(Permission permission) {
        return permissionRepository.saveAndFlush(permission);
    }

    public void removePermission(long id) {
        permissionRepository.delete(id);
    }


}
