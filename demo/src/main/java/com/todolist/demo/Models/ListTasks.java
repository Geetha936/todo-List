package com.todolist.demo.Models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table
@Data
public class ListTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Listname;

}
