package Jpract;

import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.ChannelExec;

public class pract_ssh {
	public int price=10;
	public int value;
	private int c;
	private void print(int z)
	{
		System.out.println(c + z);
	}
	pract_ssh(int x){
		c=x;
	}
	
	public static void main(String[] args) {
	    String host="10.182.137.136";
	    String user="root";
	    String password="root";
	    String command1="df -kh";
	    try{
	    	
	    	java.util.Properties config = new java.util.Properties(); 
	    	config.put("StrictHostKeyChecking", "no");
	    	JSch jsch = new JSch();
	    	Session session=jsch.getSession(user, host, 22);
	    	session.setPassword(password);
	    	session.setConfig(config);
	    	session.connect();
	    	System.out.println("Connected");
	    	
	    	Channel channel=session.openChannel("exec");
	        ((ChannelExec)channel).setCommand(command1);
	        channel.setInputStream(null);
	        ((ChannelExec)channel).setErrStream(System.err);
	        
	        InputStream in=channel.getInputStream();
	        channel.connect();
	        byte[] tmp=new byte[1024];
	        while(true){
	      //System.out.println(channel.isClosed());
	          while(in.available()>0){
	            int i=in.read(tmp, 0, 1024);
	            System.out.println("i is"+i);
	            if(i<0)break;
	            System.out.print(new String(tmp, 0, i));
	            
	          }
	          System.out.println(channel.isClosed());
	          if(channel.isClosed()){
	            System.out.println("exit-status: "+channel.getExitStatus());
	            break;
	          }
	          try{Thread.sleep(1000);}catch(Exception ee){}
	        }
	        channel.disconnect();
	        session.disconnect();
	        System.out.println("DONE");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }

	}

}
