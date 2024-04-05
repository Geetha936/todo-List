package com.todolist.demo.Controller;

import com.todolist.demo.Models.Task;
import com.todolist.demo.Services4.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/")
public class TodoListController {
    private final TodoListService todoListService;
    @Autowired
    public TodoListController(TodoListService todoListService){
        this.todoListService=todoListService;
    }
    @GetMapping("get/task")
    public Page<Task> getTasks(@RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "id") String sortBy){
        return todoListService.getTasks(PageRequest.of(page,size, Sort.by(sortBy)));
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
}
