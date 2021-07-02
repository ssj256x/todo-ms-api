package com.todoapp.todo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Table(name = "todo", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
@Entity(name = "JoinTableTodoEntity")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "completed")
    private Boolean completed;

    @Column(name = "priority", nullable = false)
    private Priority priority;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "due_date")
    private Timestamp dueDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "completion_date", nullable = false)
    private Timestamp completionDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;
}
