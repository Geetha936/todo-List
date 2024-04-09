package com.todolist.demo.Repositories;

import com.todolist.demo.Models.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task , Long > {
    @Modifying
    @Query("SELECT t FROM Task t WHERE t.ListID IN (:List_Id)")
    List<Task> findTasksByListId(@Param("List_Id") Long Id);
}
