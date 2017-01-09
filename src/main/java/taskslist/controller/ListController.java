package taskslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskslist.entity.Lists;
import taskslist.entity.User;
import taskslist.service.TasksService;

import java.util.List;

@RestController
public class ListController {

    @Autowired
    private TasksService service;

    @RequestMapping(value = "/lists",method = RequestMethod.GET)
    @ResponseBody
    public List<Lists> getAllLists(){
        return service.getAllLists();
    }

    @RequestMapping(value = "/lists/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Lists getList(@PathVariable long id){
        return service.getListByID(id);
    }

    @RequestMapping(value = "/lists",method = RequestMethod.POST)
    @ResponseBody
    public Lists saveList(@RequestBody Lists lists){
        return service.saveList(lists);
    }

    @RequestMapping(value = "/lists/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deleteList(@PathVariable long id){
        service.removeList(id);
    }
}
