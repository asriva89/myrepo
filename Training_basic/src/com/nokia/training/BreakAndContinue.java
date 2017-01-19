package com.nokia.training;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,55,6,7,2,4};
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==6)
				break;
				//continue;
			System.out.println(a[i]);;
		}*/
		System.out.println("welcome");
		loop : for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==6)
					continue ;
				System.out.println(a[j]);
			}
		}

	}

}
