package com.todolist.demo.Controller;

import com.todolist.demo.Models.ListTasks;
import com.todolist.demo.Services4.ListNameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("api/tasklist/")
public class ListNameController {
    private final ListNameServices listNameServices;
    @Autowired
    public ListNameController(ListNameServices listNameServices){
        this.listNameServices=listNameServices;
    }
    @PostMapping("add/")
    public void addnewlist(@RequestBody ListTasks listTasks){
        listNameServices.setTaskList(listTasks);
    }
    @GetMapping("get")
    public List<ListTasks> gettaksList(){
        return listNameServices.getTaskList();
    }
}
