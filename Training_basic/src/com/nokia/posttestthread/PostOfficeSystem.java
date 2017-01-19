package com.nokia.posttestthread;

public class PostOfficeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOfficeDemo office=new PostOfficeDemo();
		PostMan pman=new PostMan(office);
		pman.setName("I AM POSTMAN");
		
		User u=new User(office);
		u.setName("I AM USER");
		u.start();
		
		
		pman.start();
		try {
			pman.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
