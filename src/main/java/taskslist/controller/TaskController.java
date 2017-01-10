package taskslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskslist.entity.Task;
import taskslist.entity.User;
import taskslist.service.TasksService;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TasksService service;

    @RequestMapping(value = "/tasks",method = RequestMethod.GET)
    @ResponseBody
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }

    /*@RequestMapping(value = "/tasks/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Task getTask(@PathVariable long id){
        return service.getTaskByID(id);
    }*/

    @RequestMapping(value = "/tasks/{listid}",method = RequestMethod.GET)
    @ResponseBody
    public List<Task> getTasksByListID(@PathVariable long listid){
        return service.getTasksByListID(listid);
    }

    @RequestMapping(value = "/tasks",method = RequestMethod.POST)
    @ResponseBody
    public Task saveTask(@RequestBody Task task){
        return service.saveTask(task);
    }

    @RequestMapping(value = "/tasks/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteTask(@PathVariable long id){
        service.removeTask(id);
    }
}
