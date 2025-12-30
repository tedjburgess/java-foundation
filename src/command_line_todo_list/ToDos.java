package command_line_todo_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDos {
    ArrayList<ToDo> todoList;
    FileIO saver = new FileIO();

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

    public void saveFile(String filename) {
        
        String fileString = "";
        int currentTodo = 0;
        for (ToDo todo : todoList) {
            if (currentTodo == todoList.size() - 1) {
                fileString += todo.getName() + "|" + todo.getDescription() + "|" + todo.getStatus();
                break;    
            }
            fileString += todo.getName() + "|" + todo.getDescription() + "|" + todo.getStatus() + "|" + "\n";
            currentTodo += 1;        
        }
        saver.write(fileString, filename);
    }

    public void loadFile(String filename) {
        String data = saver.read(filename);
        String[] dataArray = data.split("\\|");
        //Removes whitespace
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = dataArray[i].trim();
        }
        int arraySize = dataArray.length;
        int firstObjectIndex = 0;
        int lastObjectIndex = 3;
        while (lastObjectIndex <= arraySize) {
            String[] objectParam = Arrays.copyOfRange(dataArray, firstObjectIndex, lastObjectIndex);
            firstObjectIndex += 3;
            lastObjectIndex += 3;
            try {
                ToDo todo = new ToDo(objectParam[0], objectParam[1], Boolean.parseBoolean(objectParam[2]));
                todoList.add(todo);
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
    }
}
