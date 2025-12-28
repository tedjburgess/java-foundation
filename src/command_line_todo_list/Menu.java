package command_line_todo_list;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean exitProgram = false;
        ToDos todoList = new ToDos();

        while (exitProgram == false) {
            Scanner scan = new Scanner(System.in);
            menu();
            System.out.print("Enter choice: ");
            String usrInput = scan.nextLine().strip();
            System.out.println("");

            switch (usrInput) {
                case "1":
                    while (true) {
                        System.out.print("Enter todo name(x to main menu): ");
                        String todoName = scan.nextLine().strip();
                        System.out.println(todoName);
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

                    break;
                case "4":

                    break;
                case "m":

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
                + "m. Show menu\n"
                + "x. Exit\n");
    }

}
