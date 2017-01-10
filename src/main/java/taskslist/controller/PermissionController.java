package taskslist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskslist.entity.Permission;
import taskslist.entity.Task;
import taskslist.service.TasksService;

import java.util.List;

@RestController
public class PermissionController {

    @Autowired
    private TasksService service;

    @RequestMapping(value = "/permissions",method = RequestMethod.GET)
    @ResponseBody
    public List<Permission> getAllPermissions(){
        return service.getAllPermissions();
    }

    /*@RequestMapping(value = "/permissions/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Permission getPermission(@PathVariable long id){
        return service.getPermissionByID(id);
    }*/

    @RequestMapping(value = "/permissions/{userid}",method = RequestMethod.GET)
    @ResponseBody
    public List<Permission> getPermissionsByUserID(@PathVariable long userid) {
        return service.getPermissionsByUserID(userid);
    }

        @RequestMapping(value = "/permissions",method = RequestMethod.POST)
    @ResponseBody
    public Permission savePermission(@RequestBody Permission permission){
        return service.savePermission(permission);
    }

    @RequestMapping(value = "/permissions/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void deletePermission(@PathVariable long id){
        service.removePermission(id);
    }
}
