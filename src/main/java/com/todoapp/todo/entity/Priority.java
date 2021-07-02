package com.todoapp.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "priority")
@Entity
@AllArgsConstructor
@Getter
public enum Priority {
    NORMAL(0),
    INTERMEDIATE(1),
    URGENT(2);

    private final Integer priorityCode;
}
