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

    public void listTodos() {
        int itemNumber = 1;
        if (todoList.size() == 0) {
            System.out.println("List empty\n");
            return;
        }
        for (ToDo todo : todoList) {
            System.out.println(itemNumber + "." + todo.getToDo());
            itemNumber += 1;
        }
        return;
    }

    public void deleteTodo(String todoName) {
        MyObject todoItem = findByName(todoList, todoName);
        if (todoItem != null) {
            todoList.remove(todoItem);
        }
    }
    public int size() {
        return todoList.size();
    }
}
