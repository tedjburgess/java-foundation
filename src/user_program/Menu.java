import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        User user = new User(null, 0, null);
        Users userList = new Users();

        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        // Use scanner object to read user input
        String userChoice = "";
        
        showMenu();
        
        // Execute input
        while (!userChoice.equals("x")) {
            
            System.out.print("Enter choice: ");            
            userChoice = sc.nextLine().strip();
            System.out.println("");
            
            switch (userChoice) {
                
                case "1":
                    System.out.print("Enter name: ");
                    String name = sc.nextLine().strip();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(sc.nextLine().strip());
                    System.out.print("Enter hometown: ");
                    String town = sc.nextLine().strip();
                    user = new User(name, age, town);
                    userList.addUser(user);
                    System.out.println("");
                    break;
                    
                case "2":
                    userList.displayUsers();
                    break;
                case "x":
                    // findUsers();
                    break;
                case "m":
                    showMenu();
                    break;
                case "c":
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                    showMenu();
                    break;
                default:
                    break;
            }
        }
    }

    private static void showMenu() {
        // Prints user menu
        System.out.println("Menu (x to exit program): \n"
                + "1. Add users\n"
                + "2. List users\n"
                + "3. Find users\n"
                + "m. Show menu\n"
                + "c. Clear terminal\n");
        
    }

}
