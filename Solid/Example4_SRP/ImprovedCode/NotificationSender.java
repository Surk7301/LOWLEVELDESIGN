package Solid.Example4_SRP.ImprovedCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications, String message){
        for(Notification notification : notifications){
            notification.sendMessage(message);
        }
    }
    
}
