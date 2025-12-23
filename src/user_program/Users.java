import java.util.ArrayList;

public class Users {
    ArrayList<User> userList = new ArrayList<User>();
    
    public Users() {
        
    }

    public void addUser(User user) {
        userList.add(user);
    }
    
    public void displayUsers() {
        
        for (User userData : userList) {
            if (userData.name == null) {
                continue;
            }
            System.out.println("Users: ");
            System.out.println(userData.name);
            System.out.println(userData.age);
            System.out.println(userData.hometown);
        }
        
        return;
    }

     
}
