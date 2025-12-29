package command_line_todo_list;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean exitProgram = false;
        ToDos todoList = new ToDos();
        Scanner scan = new Scanner(System.in);
        
        while (exitProgram == false) {
            
            menu();
            System.out.print("Enter choice: ");
            String usrInput = scan.nextLine().strip();
            System.out.println("");

            switch (usrInput) {
                case "1":
                    while (true) {
                        System.out.print("Enter todo name(x to main menu): ");
                        String todoName = scan.nextLine().strip();
                        if (todoName.equals("x")) {
                            break;
                        }
                        System.out.print("Enter description(x to main menu): ");
                        String todoDescription = scan.nextLine().strip();
                        if (todoDescription.equals("x")) {
                            break;
                        }
                        ToDo todoObject = new ToDo(todoName, todoDescription, false);
                        todoList.addTodo(todoObject);
                    }
                    System.out.println("");
                    break;
                case "2":
                    todoList.listTodos();
                    break;
                case "3":
                    if (todoList.size() == 0) {
                        System.out.println("List empty");
                        break;
                    }
                    todoList.listTodos();
                    while (true) {
                        System.out.print("Choose item to mark done (x to exit): ");
                        String itemNumber = scan.nextLine().strip();
                        if (itemNumber.equals("x")) {
                            break;
                        }
                        try {
                            int doneItem = Integer.parseInt(itemNumber);
                            todoList.markDone(doneItem);
                        } catch (Exception e) {
                            System.out.println("Error: " + e);
                        }

                    }
                    System.out.println("");
                    System.out.println("Updated list: ");
                    todoList.listTodos();
                    break;
                case "4":
                    if (todoList.size() == 0) {
                        System.out.println("List empty");
                        break;
                    }
                    while (true) {
                        todoList.listTodos();
                        System.out.println("x to exit");
                        System.out.print("Remove #: ");
                        String removeNumber = scan.nextLine().strip();
                        System.out.println("");
                        if (removeNumber.equals("x")) {
                            break;
                        }
                        try {
                            int remove = Integer.parseInt(removeNumber);
                            todoList.deleteTodo(remove);
                        } catch (Exception e) {
                            System.out.println("Error: " + e);
                        }

                    }
                    break;
                case "x":
                    exitProgram = true;
                    System.out.println("Thank you for using the list " + "🙂");
                    break;
                default:
                    break;
            }
        }

    }

    private static void menu() {
        System.out.println("Menu: \n"
                + "1. Add todo\n"
                + "2. Show todo list\n"
                + "3. Mark todo as done\n"
                + "4. Delete a todo\n"
                + "x. Exit\n");
    }

}
