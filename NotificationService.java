package com.naidu.factory;

public class NotificationService {
	
	public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("SMS");
		notification.notifyUser();
	}

}
