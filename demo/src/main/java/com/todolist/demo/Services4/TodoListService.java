package com.todolist.demo.Services4;

import com.todolist.demo.Models.Task;
import com.todolist.demo.Repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TodoListService {
    private final  TaskRepository taskRepository;
    @Autowired
    public TodoListService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getSpecificTasks(Long id){
        return taskRepository.findTasksByListId(id);
    }
    public void addNewTask(Task task){
        taskRepository.save(task);
    }

    public void changetaskstatus(Long id){
        Optional<Task> task = taskRepository.findById(id);
        task.get().setCompleted(!task.get().isCompleted());
        taskRepository.save(task.get());
    }
    public void changeFavoriteStatus(Long id){
        Optional<Task> task = taskRepository.findById(id);
        task.get().setFavourite(!task.get().isFavourite());
        taskRepository.save(task.get());
    }
    public void deleteTask(Long id){
//        Optional<Task> task = taskRepository.findById(id);
        taskRepository.deleteById(id);

    }
}
