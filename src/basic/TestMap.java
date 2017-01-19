package basic;

import java.util.HashMap;

import Tempractice.TempHmp;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scores = new HashMap<String, Integer>() ;
		//TempHmp<String, Integer> scores = new TempHmp<String, Integer>() ;
		scores.put("Ankur", 1);
		scores.put("ABC", 4);
		scores.put("ABC",53);
		
		System.out.print(scores);
		  
		System.out.println(scores.get("ABC"));
		//TempHmp
//		/System.out.print(paramBoolean);
	//System.out.print();
	}

}	
