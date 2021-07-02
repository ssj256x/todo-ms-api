//package com.todoapp.todo.api;
//
//import com.todoapp.todo.model.Priority;
//import com.todoapp.todo.model.TodoResponse;
//import org.springframework.http.ResponseEntity;
//
//import java.time.OffsetDateTime;
//import java.util.List;
//
//public class TodosApiImpl implements TodosApiDelegate {
//
//    @Override
//    public ResponseEntity<List<TodoResponse>> getTodosWithFilter(String name,
//                                                                 String desc,
//                                                                 Priority priority,
//                                                                 Boolean completed,
//                                                                 OffsetDateTime completionDate,
//                                                                 OffsetDateTime dueDate) {
//
//        return TodosApiDelegate.super.getTodosWithFilter(name, desc, priority, completed, completionDate, dueDate);
//    }
//}
