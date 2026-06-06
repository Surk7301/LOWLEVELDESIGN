package Solid.Example4_SRP.ImprovedCode;

public class EmailNotification implements Notification{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email notification sent: " + message);
    }

}
    

