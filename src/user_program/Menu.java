import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Prints user menu
        System.out.println("Menu: \n"
            + "1. Add users\n"
            + "2. List users\n"
            + "3. Find users\n"
        );
        //Create a scanner object
        System.out.print("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        //Use scanner object to read user input
        int userChoice = sc.nextInt();
        // Execute input
        switch (userChoice) {
            case 1:
                //addUsers();
                break;
            case 2:
                //listUsers();
                break;
            case 3:
                //findUsers();
                break;
            default:
                break;
        }
    }
}
