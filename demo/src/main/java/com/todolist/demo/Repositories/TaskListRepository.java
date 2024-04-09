package com.todolist.demo.Repositories;

import com.todolist.demo.Models.ListTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<ListTasks , Long> {
}
