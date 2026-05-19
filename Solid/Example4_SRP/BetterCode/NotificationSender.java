package Solid.Example4_SRP.BetterCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<String> notificationTypes, String message){
        for(String notificationType : notificationTypes){
            switch(notificationType){
                case "email":
                    EmailNotification emailNotification = new EmailNotification();
                    emailNotification.sendEmailNotification(message);
                    break;
                case "sms":
                    SMSNotification smsNotification = new SMSNotification();
                    smsNotification.sendSMSNotification(message);
                    break;
                case "push":
                    PUSHNotification pushNotification = new PUSHNotification();
                    pushNotification.sendPUSHNotification(message);
                    break;
                default:
                    System.out.println("Invalid notification type");
            }
        }
        
    }
  
}
