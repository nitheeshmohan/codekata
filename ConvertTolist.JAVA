class converttolist
{
	class node
	{
		int data;
		node left,right;
	}
	class list
	{
		int data;
		list next;
	}	
	//List and node elements
	    private list head,tail;
		private node root,temp;
		
	//initialising all elements As Null	
	public converttolist()
	{
		 head=null;
		 tail=null;
		 root=null;
		 temp=root;
		 
	}
	
	//user calling method
	public void insert(int x)
	{
		node p=new node();
		p.data=x;
		p.right=null;
		p.left=null;
		InsertToTree(p,root);
	}
	
	//Insertion process .. Recursion
	private void InsertToTree(node p,node temp)
	{	
		
		if(root==null)
			root=p;
		else
		{
			if(p.data<temp.data)
			{
				if(temp.left==null)
					temp.left=p;
				else
					InsertToTree(p,temp.left);
			}
			if(p.data>temp.data)
			{
				if(temp.right==null)
					temp.right=p;
				else
					InsertToTree(p,temp.right);
			}
		}
	}
	
	//user calling convert fucntion
	public void Convert()
	{
		ConvertIt(root);
	}
	
	//Inorder traversal
	private void ConvertIt(node temp)
	{
		if(root==null)
			System.out.println("No Tree");
		if(temp==null)
			return;
		else
		{
			ConvertIt(temp.left);
			InsertToList(temp.data);
			ConvertIt(temp.right);
		}
	}
	
	//Inserting to list
	private void InsertToList(int x)
	{
		list p=new list();
		p.data=x;
		p.next=null;
		if(head==null)
			{head=p;tail=p;}
		else
			{tail.next=p;tail=p;}
		System.out.println(p.data);
	}
}


//Main class
class maincl
{
	public static void main(String args[])
	{
		converttolist c=new converttolist();
		c.insert(10);
		c.insert(7);
		c.insert(9);
		c.insert(15);
		c.Convert();
	}
}
