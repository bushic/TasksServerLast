package taskslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskslist.entity.User;
import taskslist.service.TasksService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private TasksService service;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public  List<User> getAllUsers(){
        return service.getAllUsers();
    }

    /*@RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable long id){
        return service.getUserByID(id);
    }*/

    @RequestMapping(value = "/users/{login}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String login){
        return service.getUserByLogin(login);
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteUser(@PathVariable long id){
        service.removeUser(id);
    }

}
