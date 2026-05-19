package Solid.Example2_SRP.BetterCode;

public class UserManager {
        
    public void add(User user){
        if(user.getAge() < 18){
            throw new IllegalArgumentException("user is not adult");
        }
        System.out.println("User added");
    }

    public void delete(User user){
        System.out.println("User deleted");
    }

    public void update(User user){
        if(user.getAge()<18){
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User added");
    }

    
}
