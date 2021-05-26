package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        // TODO Auto-generated method stub
        return data;
    }

    @Override
    public void add(Todolist todolist) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Integer number) {
        // TODO Auto-generated method stub
        
    }
}
