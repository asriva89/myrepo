package com.nokia.postoffice;

public class PostOfficeDemo {
	
	private String currentMessage;
	private boolean isEmpty=true;
	
	public synchronized void addMessage(String message){
		while(!isEmpty)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		currentMessage=message;
		isEmpty=false;
		notifyAll();
	}
	
	public synchronized String deliverMessage()
	{
		while(isEmpty)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String msg=currentMessage;
		isEmpty=true;
		notifyAll();
		return "Message Delivered!!!"+msg;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
