package org.example.todo;

import org.example.todo.Todo;
import org.example.todo.TodoList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoListTest {

    @Test
    public void testAddTodo() {
        TodoList todoList = new TodoList();
        Todo todo1 = new Todo("Buy groceries", "Milk, bread, eggs", false);
        Todo todo2 = new Todo("Do laundry", "Wash clothes, fold clothes", false);
        todoList.add(todo1);
        todoList.add(todo2);
        assertThat(todoList.getTodos().size()).isEqualTo(2);
        assertThat(todoList.getTodos()).containsExactly(todo1, todo2);
    }

    @Test
    public void testRemoveTodo() {
        TodoList todoList = new TodoList();
        Todo todo1 = new Todo("Buy groceries", "Milk, bread, eggs", false);
        Todo todo2 = new Todo("Do laundry", "Wash clothes, fold clothes", false);
        todoList.add(todo1);
        todoList.add(todo2);
        todoList.remove(todo1);
        assertThat(todoList.getTodos()).containsExactly(todo2);
    }

    @Test
    public void testMarkAsDone() {
        TodoList todoList = new TodoList();
        Todo todo1 = new Todo("Buy groceries", "Milk, bread, eggs", false);
        Todo todo2 = new Todo("Do laundry", "Wash clothes, fold clothes", false);
        todoList.add(todo1);
        todoList.add(todo2);
        assertThat(todoList.getUncompleted().size()).isEqualTo(2);
        todoList.markAsDone(todo1);
        assertThat(todoList.getUncompleted().size()).isEqualTo(1);
        todoList.markAsDone(todo2);
        assertThat(todoList.getUncompleted().size()).isEqualTo(0);
    }

    @Test
    public void testGetTodosWithUncompletedFilter() {
        TodoList todoList = new TodoList();
        Todo uncompleteTodo1 = new Todo("Buy groceries", "Milk, bread, eggs", false);
        Todo uncompleteTodo2 = new Todo("Do laundry", "Wash clothes, fold clothes", false);
        Todo completeTodo = new Todo("Call mom", "Ask how she is doing", true);
        todoList.add(uncompleteTodo1);
        todoList.add(uncompleteTodo2);
        todoList.add(completeTodo);
        List<Todo> uncompletedTodos = todoList.getUncompleted();
        assertThat(uncompletedTodos).containsExactly(uncompleteTodo1, uncompleteTodo2);
        assertThat(uncompletedTodos).doesNotContain(completeTodo);
    }

    @Test
    public void testCountTodo(){
        TodoList todoList = new TodoList();
        Todo uncompleteTodo1 = new Todo("Buy groceries", "Milk, bread, eggs", false);
        Todo uncompleteTodo2 = new Todo("Do laundry", "Wash clothes, fold clothes", false);
        Todo completeTodo = new Todo("Call mom", "Ask how she is doing", true);
        todoList.add(uncompleteTodo1);
        todoList.add(uncompleteTodo2);
        todoList.add(completeTodo);
        List<Todo> all = todoList.getTodos();
        assertThat(all.size()).isEqualTo(3);
    }

}

