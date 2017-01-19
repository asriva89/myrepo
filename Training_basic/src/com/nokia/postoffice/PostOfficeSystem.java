package com.nokia.postoffice;

public class PostOfficeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOfficeDemo office=new PostOfficeDemo();
		PostMan pman=new PostMan(office);
		User u=new User(office);
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
