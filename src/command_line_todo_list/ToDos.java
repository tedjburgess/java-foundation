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

    public void deleteTodo(int todoIndex) {
        todoIndex -= 1;
        todoList.remove(todoIndex);
    }

    public int size() {
        return todoList.size();
    }

    public void markDone(int updateNumber) {
        ToDo objectDone = todoList.get(updateNumber - 1);
        objectDone.finishTodo();
    }
}
