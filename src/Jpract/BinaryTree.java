package Jpract;

class Node{
	Node left,right;
	String data;
	int value;
	Node(String d,int v)
	{
		this.data=d;
		this.value=v;
	}
	public String toString()
	{
		return data +" has value "+value;
	}
	
}

public class BinaryTree {
	Node root;	
	
	
	@SuppressWarnings("unused")
	public void addnewNode(String data,int value){
		
		Node newNode= new Node(data,value);
		if (root == null)
		{
			root=newNode;
		}
		else
		{
			Node focusnode= root;
			//Node parent;
			while(true)
			{
				//parent=focusnode;
				if(value < focusnode.value)
				{
					if(focusnode.left==null){
						focusnode.left=newNode;
						return;
					}
					focusnode=focusnode.left;
					
				}
				else
				{
					if(focusnode.right==null)
					{
						focusnode.right=newNode;
						return;
					}
					focusnode=focusnode.right;
					
					
				}
			}
			
		}
		
	}
	
	
	
	
	
	
	public void inOrder(Node focusNode)
	{
		if (focusNode!=null)
		{
			inOrder(focusNode.left);
			System.out.println(focusNode);
			inOrder(focusNode.right);
		}
		
	}
	
	
	public void preOrder(Node focusNode)
	{
		if(focusNode!=null)
		{
			System.out.println(focusNode);
			preOrder(focusNode.left);
			preOrder(focusNode.right);
		}
	}
	
	public void postOrder(Node focusNode)
	{
		if(focusNode!=null)
		{
			postOrder(focusNode.left);
			postOrder(focusNode.right);
			System.out.println(focusNode);
		}
	}
	
	
	
	
	public Node findKey(int key)
	{
		Node focusNode=root;
		while(focusNode.value!=key)
		{
			if(focusNode.value < key)
			{
				focusNode=focusNode.right;
			}
			else
			{
				focusNode=focusNode.left;
			}
			if (focusNode==null)
			{
				return null;
			}
			
		}
		return focusNode;
	}
	
	 /*public boolean remove(int key) {
		  Node focusNode=root;
		  Node parent;
		  parent = focusNode;
		  
		  boolean isAtLeft=true;
		while(focusNode.value!=key)
		{
			parent = focusNode;

			if (focusNode.value > key)
			{
				isAtLeft=true;
				focusNode=focusNode.left;
			}
			else
			{
				isAtLeft=false;
				focusNode=focusNode.right;
				
			}
			if (focusNode == null)
			{
				return false;
			  
			}
		  
		}
		//If node does not have left or right child then you can delete it
		  if(focusNode.left==null && focusNode.right==null)
		  {
			  if(focusNode==root)
				  root = null;
			  else if(isAtLeft)
			  {
				  focusNode.left=null;
			  }
			  else
			  {
		         parent.right = null;
		         
			  }
		  }
		 if (focusNode.right==null){
			  if(focusNode==root)
				  root=focusNode.left;
			  else if(isAtLeft)
			  {
				  parent.left=focusNode.left;
				  
			  }
			  else
			  {
				  parent.right=focusNode.left;
			  }
			 
		 }
		 
		 if(focusNode.left==null){
			 if(focusNode==root)
				 root=focusNode.right;
			 else if (isAtLeft)
			 {
				 parent.left=focusNode.right;
			 }
			 else
			 {
				 parent.right=focusNode.right;
			 }
		 }
		 
		 //if Both node exist than we need to replace it with the least value i.e. left most value in right leg
		 
		 else{
			 Node rep=replacementNode(focusNode);
			 if(focusNode==root)
			 {
				 root=rep;
				 				 
			 }
			 else if(isAtLeft)
			 {
				 parent.left=rep;
				 			 
			 }
			 else
			 {
				 parent.right=rep;
				 
			 }
			  rep.left=focusNode;
			 
			 
		 }
		 
		  
		  
		  
	 }
		
	*/
	 void deletevalue(int value)
	    {
	        root = deleteRec(root, value);
	    }
	 
	    /* A recursive function to insert a new value in BST */
	    Node deleteRec(Node root, int value)
	    {
	        /* Base Case: If the tree is empty */
	        if (root == null)  return root;
	 
	        /* Otherwise, recur down the tree */
	        if (value < root.value)
	            root.left = deleteRec(root.left, value);
	        else if (value > root.value)
	            root.right = deleteRec(root.right, value);
	 
	        // if value is same as root's value, then This is the node
	        // to be deleted
	        else
	        {
	            // node with only one child or no child
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;
	 
	            // node with two children: Get the inorder successor (smallest
	            // in the right subtree)
	            root.value = minValue(root.right);
	 
	            // Delete the inorder successor
	            root.right = deleteRec(root.right, root.value);
	        }
	 
	        return root;
	    }
	 
	    int minValue(Node root)
	    {
	        int minv = root.value;
	        while (root.left != null)
	        {
	            minv = root.left.value;
	            root = root.left;
	        }
	        return minv;
	    }
	
	
	    
	    Node getRep(Node replacedNode)
	    {
	    	Node repParent=replacedNode;
	    	Node replacement=replacedNode;
	    	Node focussedNode=replacedNode.right;
	    	while(focussedNode!=null)
	    	{
	    		repParent=replacement;
	    		replacement=focussedNode;
	    		focussedNode=focussedNode.left;
	    	}
	    	if(replacedNode.right!=replacement)
	    	{
	    		repParent.left=replacement.right;
	    		replacement.right=replacedNode.right;
	    	}
	    	return replacement;
	    }
	    
	    
	    	
	   // }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.addnewNode("ankur", 40);
		bt.addnewNode("dinesh", 30);
		bt.addnewNode("kartik", 50);
		bt.addnewNode("dinesh", 25);
		bt.addnewNode("sri", 43);
		bt.inOrder(bt.root);
		//System.out.println("PREORDER TRAVERSAL");
		
		//System.out.println("PostOrder Traversal");
		//bt.postOrder(bt.root);
		System.out.println(bt.findKey(215));
		bt.deletevalue(50);
		System.out.println("Deleteing value and tarvaersing again");
		bt.preOrder(bt.root);
	}

}
