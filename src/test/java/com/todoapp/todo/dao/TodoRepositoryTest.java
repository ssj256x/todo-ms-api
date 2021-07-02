package com.todoapp.todo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoRepositoryTest {

    @Autowired
    TodoRepository todoRepository;

    @Test
    void createTodoSuccess() {

    }

    @Test
    void readTodoSuccess() {

    }

    @Test
    void updateTodoSuccess() {

    }

    @Test
    void deleteTodoSuccess() {

    }
}
