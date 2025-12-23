import java.util.ArrayList;

public class Users {
    ArrayList<User> userList = new ArrayList<User>();
    
    public Users() {
        
    }

    public void addUser(User user) {
        userList.add(user);
    }
    
    public void displayUsers() {
        
        int userNumber = 1;
        for (User userData : userList) {
            if (userData.name == null) {
                continue;
            }
            System.out.println("User " + userNumber + ":");
            System.out.println(userData.name);
            System.out.println(userData.age);
            System.out.println(userData.hometown + "\n");
            userNumber += 1;
        }
        
        return;
    }

    

     
}
