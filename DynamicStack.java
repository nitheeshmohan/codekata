import java.util.*;
class doublylinkedstack
{

class node
{
	public int data;
	public node next;
}
        public node top=null;
        public int c=0;
	public void push(int n)
	{
		node p=new node();
		p.data=n;
		p.next=null;
		if(top==null)
		{top=p;c++;}
		else
		{p.next=top;top=p;c++;}
	}
        public int pop()
        {
            int i;
            if(top==null)
                return 0;
             i=top.data;
            top=top.next;
            return i;
        }
        public int peek()
        {
            if(top==null)
                return 0;
            return top.data;
        }
         public int count()
         {
             return c;
         }
         public void clear()
         {
             top=null;
         }
}
class DynamicStack
{
    public static void main(String s[])
    {
        doublylinkedstack d=new doublylinkedstack();
        d.push(10);
        d.push(20);
        d.push(30);
        System.out.println("The popped element is "+d.pop()+"peeked "+d.peek()+"count"+d.count());
        
    }
    
}   
    
    
