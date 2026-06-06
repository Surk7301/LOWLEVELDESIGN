package Solid.Example4_SRP.ImprovedCode;

public class PUSHNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("PUSH notification sent: " + message);
    }

    
}
