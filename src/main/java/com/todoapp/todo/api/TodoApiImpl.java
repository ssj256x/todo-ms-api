//package com.todoapp.todo.api;
//
//import com.todoapp.todo.model.Todo;
//import com.todoapp.todo.model.TodoResponse;
//import org.springframework.http.ResponseEntity;
//
//public class TodoApiImpl implements TodoApiDelegate{
//
//    @Override
//    public ResponseEntity<TodoResponse> createTodo(Todo todo) {
//        return TodoApiDelegate.super.createTodo(todo);
//    }
//
//    @Override
//    public ResponseEntity<Todo> deleteTodo(Integer todoIdToDelete) {
//        return TodoApiDelegate.super.deleteTodo(todoIdToDelete);
//    }
//
//    @Override
//    public ResponseEntity<Todo> getTodoById(Integer idToFetch) {
//        return TodoApiDelegate.super.getTodoById(idToFetch);
//    }
//
//    @Override
//    public ResponseEntity<Todo> updateTodo(Integer todoIdToUpdate, Todo todo) {
//        return TodoApiDelegate.super.updateTodo(todoIdToUpdate, todo);
//    }
//}
