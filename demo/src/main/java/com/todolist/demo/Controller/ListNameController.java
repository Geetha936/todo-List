package com.todolist.demo.Controller;

import com.todolist.demo.Models.ListTasks;
import com.todolist.demo.Services4.ListNameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
