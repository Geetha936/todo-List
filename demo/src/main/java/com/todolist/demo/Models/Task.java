package com.todolist.demo.Models;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Entity
@Table
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String task ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;
    private boolean isCompleted;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate remainderDate;
    private boolean favourite;
    private String ListName;
    private Long ListID;

}
