package Solid.Example4_SRP.ProblematicCode;

public enum NotificationType {
    EMAIL,
    SMS,
    PUSH_NOTIFICATION,
    WHATSAPP;

    public void sendSMSNotification(String message){
        System.out.println("Sending SMS notification: " + message);
    }
    public void sendEmailNotification(String message){
        System.out.println("Sending Email notification: " + message);
    }
    public void sendPushNotification(String message){
        System.out.println("Sending Push notification: " + message);
    }
    public void sendWhatsAppNotification(String message){
        System.out.println("Sending WhatsApp notification: " + message);
    }

    
}
