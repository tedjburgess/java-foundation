import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        User user = new User(null, 0, null);
        Users userList = new Users();

        // Create a scanner object

        Scanner sc = new Scanner(System.in);
        // Use scanner object to read user input
        String userChoice = "";
        // Execute input
        while (!userChoice.equals("x")) {
            
            // Prints user menu
            System.out.println("Menu: \n"
                    + "1. Add users\n"
                    + "2. List users\n"
                    + "3. Find users\n");
            System.out.print("Enter choice: ");
            userChoice = sc.nextLine().strip();
            System.out.println(userChoice);

            switch (userChoice) {
                
                case "1":
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter hometown: ");
                    String town = sc.nextLine();
                    user = new User(name, age, town);
                    userList.addUser(user);
                    break;
                    
                case "2":
                    userList.displayUsers();
                    break;
                case "x":
                    // findUsers();
                    break;
                default:
                    break;
            }
        }
    }

}
