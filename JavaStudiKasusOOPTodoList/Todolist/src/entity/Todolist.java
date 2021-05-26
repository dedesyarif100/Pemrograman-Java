package entity;

public class Todolist {
    private String todo;

    public TodoList() {
        
    }

    public TodoList(String todo) {
        this.todo = todo;
        return todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
