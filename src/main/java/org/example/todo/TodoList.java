package org.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private final List<Todo> todos = new ArrayList<>();

    public void add(Todo todo) {
        todos.add(todo);
    }

    public void remove(Todo todo) {
        todos.remove(todo);
    }

    public void markAsDone(Todo todo) {
        todos.stream()
                .filter(t -> t.equals(todo))
                .findFirst()
                .ifPresent(t -> {
                    todos.remove(t);
                    todos.add(new Todo(t.title(), t.description(), true));
                });
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public List<Todo> getUncompleted() {
        return todos.stream()
                .filter(todo -> !todo.isDone())
                .toList();
    }

}

