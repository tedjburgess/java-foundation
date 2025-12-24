public class User {
    String name;
    int age;
    String hometown;

    public User(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getUsrData() {
        return "User: \n"
        + name + "\n"
        + age + "\n"
        + hometown + "\n";
    }
}
