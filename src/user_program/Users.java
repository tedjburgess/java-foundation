import java.util.ArrayList;
import java.util.List;

public class Users {
    ArrayList<User> userList = new ArrayList<User>();
    
    public Users() {
        
    }

    public static boolean isListNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
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

    public void findUsers(String usrName) {
        if (usrName.equals("x")) {
            System.out.println("");
            return;
        }

        boolean isArray = isListNullOrEmpty(userList);
        if (isArray == true) {
            System.out.println("List empty\n");
            return;
        }
        for (User user : userList) {
            if (user.name.equals(usrName)) {
                System.out.println(user.getUsrData());
                return; 
            }
        }
        System.out.println("User not found\n");
    }

     
}
