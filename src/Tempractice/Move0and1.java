package Tempractice;

public class Move0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={0,1,1,0,1,0};
		int end=a.length-1;
		System.out.println(end);
		int start=0;
		while(start<end)
		{
			for(int i=start;i<a.length-1;i++)
			{
				if(a[i]==0 && start< end)
				{
					start++;
				}
				else{
					break;
				}
			}
			for(int j=end;j>0;j--)
			{
				if(a[j]==1 && start<end)
				{
					end--;
				}
				else
				{
					break;
				}
			}
			if(start<end)
			{
				a[end]=a[start];
				a[start]=0;
				end--;
				start++;
			}
			
		}
		for(int i=0;i<(a.length);i++)
			System.out.println(a[i]);
		
	

	}

}
