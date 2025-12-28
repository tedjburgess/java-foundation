package command_line_todo_list;

public class ToDo {
    String name;
    String description;
    boolean status;
    
    public ToDo(String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }
    public String getToDo() {
        String statusAsii = "❌";
        if (status == true) {
            statusAsii = "✅";
        }
        return "Name: " + name + statusAsii + "\n"
        + "Description: " + description + "\n";
    }
    // public boolean finishTodo(boolean finished) {
    //     return(finished);
    // }
    // public String getName() {
    //     return name;
    // }
    // public String getDescription() {
    //     return description;
    // }
}
