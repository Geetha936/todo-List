package com.todolist.demo.Controller;

import com.todolist.demo.Models.Task;
import com.todolist.demo.Services4.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping(path = "api/")
public class TodoListController {
    private final TodoListService todoListService;
    @Autowired
    public TodoListController(TodoListService todoListService){
        this.todoListService=todoListService;
    }
    @GetMapping("get/task")
    public List<Task> getTasks(){
        return todoListService.getTasks();
    }
    @PostMapping("add/task/")
    public void createTask(@RequestBody Task task){
        todoListService.addNewTask(task);
    }
    @PutMapping("update/task/status")
    public void changeTaskStatus(@RequestParam Long id ){
        System.out.println(id);
        todoListService.changetaskstatus(id);
    }
    @PutMapping("update/task/favourite")
    public void changeFavouriteStatus(@RequestParam Long id){
        todoListService.changeFavoriteStatus(id);
    }
    @DeleteMapping("delete/task")
    public void deleteTask(@RequestParam Long id){
        todoListService.deleteTask(id);
    }
    @GetMapping("get/specific/task")
    public List<Task> getSpecificTask(@RequestParam Long id){
        return todoListService.getSpecificTasks(id);
    }
}
