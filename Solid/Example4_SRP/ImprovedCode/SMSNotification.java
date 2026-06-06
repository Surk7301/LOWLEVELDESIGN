package Solid.Example4_SRP.ImprovedCode;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS notification sent: " + message);
    }
    
}
