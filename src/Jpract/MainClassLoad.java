package Jpract;

import com.jcraft.jsch.JSch;

public class MainClassLoad {

	  public static void main(String[] args){

	    ClassLoader classLoader = MainClassLoad.class.getClassLoader();
	    //JSch jsch = new JSch();

	    try {
	        Class aClass = classLoader.loadClass("Jpract.RunTest");
	        System.out.println("aClass.getName() = " + aClass.getSimpleName());
	        System.out.println(JSch.class.getClassLoader());
	        Class taClass=classLoader.loadClass("Jpract.RunTest");
	         aClass=classLoader.loadClass("Jpract.RunTest");
	        // URLClassLoader 
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	}
}
