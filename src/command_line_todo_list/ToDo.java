package command_line_todo_list;

public class ToDo {
    String name;
    String description;
    
    public ToDo(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getToDo() {
        return "Name: " + name + "\n"
        + "Description: " + description + "\n";
    }
}
