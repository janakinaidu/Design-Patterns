package com.naidu.factory;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("sending an Email notification");

	}

}
