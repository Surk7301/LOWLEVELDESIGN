package Solid.Example4_SRP.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<NotificationType> notificationTypes, String message){
        for(NotificationType type : notificationTypes){
            switch(type){
                case EMAIL:
                    type.sendEmailNotification(message);
                    break;
                case SMS:
                    type.sendSMSNotification(message);
                    break;
                case PUSH_NOTIFICATION:
                    type.sendPushNotification(message);
                    break;
                case WHATSAPP:
                    type.sendWhatsAppNotification(message);
                    break;
            }
        }
    }
    
}
