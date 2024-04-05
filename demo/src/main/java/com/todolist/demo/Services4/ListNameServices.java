package com.todolist.demo.Services4;

import com.todolist.demo.Models.ListTasks;
import com.todolist.demo.Repositories.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListNameServices {

    private final TaskListRepository taskListRepository;
    @Autowired
    public ListNameServices(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }
    public void setTaskList(ListTasks newListTask){
        taskListRepository.save(newListTask);
    }
}
