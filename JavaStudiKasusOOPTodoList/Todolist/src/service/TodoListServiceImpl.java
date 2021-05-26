package service;

import repository.TodoListRepository;
import entity.Todolist;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] model = todoListRepository.getAll();
        
        System.out.println("TODO LIST");
        System.out.println("----------------------------");
        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;
            
            if (todolist != null) {
                System.out.println(no + ". " + todolist.getTodo());
            } else {
                System.out.println("Tidak ada Todo List");
                break;
            }
        }
        System.out.println("----------------------------");
    }

    @Override
    public void addTodoList(String todo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeTodoList(Integer number) {
        // TODO Auto-generated method stub
        
    }
    
}
