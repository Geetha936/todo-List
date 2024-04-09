package com.todolist.demo.Services4;

import com.todolist.demo.Models.ListTasks;
import com.todolist.demo.Repositories.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<ListTasks> getTaskList(){
       return taskListRepository.findAll();
    }
}
