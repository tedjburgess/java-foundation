package command_line_todo_list;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean exitProgram = false;
        menu();
        
        while(exitProgram == false) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter choice: ");
            String usrInput = scan.nextLine();

            switch (usrInput) {
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "m":
                    
                    break;
                case "x":
                    exitProgram = true;
                    break;
                default:
                    break;
            }
            scan.close();
        }
        
        

    }

    private static void menu() {
        System.out.println("Menu: \n" 
        + "1. Add todo\n"
        + "2. Show todo list\n"
        + "3. Mark todo as done\n"
        + "4. Delete a todo\n"
        + "m. Show menu\n"
        + "x. Exit\n"
        );
    }
    

}
