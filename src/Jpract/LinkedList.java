package Jpract;

public class LinkedList {
	NodeLL root;
	
	
	
	public void addNode(int val)
	{
		NodeLL n=new NodeLL(val);
		if(root==null)
		{
			root=n;
			root.end=null;
			
		}
		
		else
		{
			NodeLL focusNode=root;
			//NodeLL parent=root;
			while(true)
			{
			if(focusNode.end==null){
				focusNode.end=n;
				
				return;
			}
			focusNode=focusNode.end;
			}
			
			
			
		}
		
	}
	
	void traverseLL()
	{
		NodeLL focus=root;
		while(focus!=null)
		{
			System.out.println(focus);
			focus=focus.end;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a=new LinkedList();
		a.addNode(20);
		a.addNode(50);
		a.addNode(70);
		
		
		a.traverseLL();
		
		

	}

}
