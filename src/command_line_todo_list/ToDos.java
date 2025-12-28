package command_line_todo_list;

import java.util.ArrayList;
import java.util.List;

public class ToDos {
    ArrayList<ToDo> todoList;
    
    public ToDos() {
        this.todoList = new ArrayList<ToDo>();
    }

    public void addTodo(ToDo todoItem) {
        todoList.add(todoItem);     
    }

    public MyObject findByName(List<MyObject> objects, String name) {
        for (MyObject obj : objects) {
            if (obj.getName().equals(name)) {
                return obj;
            }
        }
        return null; // not found
    }


    public void deleteTodo(String todoName) {
        MyObject todoItem = findByName(todoList, todoName);
        if (todoItem != null) {
            todoList.remove(todoItem);
        }
    }
}
