import java.util.*;
class doublyLinkedList
{

class node
{
	public int data;
	public node next,prev;
}
        public node head=null;
        public node tail=null;
        public int c=1;
	public void add(int n)
	{
		node p=new node();
		p.data=n;
		p.next=null;
		p.prev=null;
		if(head==null)
		{head=p;tail=p;c++;}
		else
		{tail.next=p;p.prev=tail;tail=p;c++;}
	}
	public void disp()
	{	
		node temp;
		temp=head;
		while(temp!=null)
		{System.out.print(temp.data+" ");temp=temp.next;}
                System.out.println();
	}
	public int[] getArray()
	{
		int[] a=new int[c];
		int x=0;
		node temp=head;
		while(temp!=null)
		{a[x++]=temp.data;temp=temp.next;}
		return a;
	}
	public int RetrieveAtIndex(int n)
	{
		int count=1;
		node temp=head;
		while(temp!=null)
		{
			if(count==n)
			{return temp.data;}
                        
                        
			else
				count++;
			temp=temp.next;
		}
		return 0;
	}
	public int search(int n)
	{
		int i,count=1;
		node temp=head;
		while(temp!=null)
		{
			if(temp.data==n)
			{return count;}
                        else
                            count++;
                        temp=temp.next;
                }
                return -1;
	}
        public void insertAt(int po,int n)
        {
            if(po>c)
                System.out.println("Only "+c+" Elements available");
            else
            {
             int count=1;
            node p=new node();
            p.data=n;p.next=null;p.prev=null;
            node temp=head;
            if(po==1)
            {p.next=head;head=p;}
            else
            {
                 while(temp!=null)
                {
                     if(count++==po)
                    {
                        //System.out.println("The temp.data is "+temp.data+" temp.prev= "+temp.prev+" Temp.next= "+temp.next);
                        temp.prev.next=p;
                        p.prev=temp.prev;
                        p.next=temp;
                        temp.prev=p;
                        break;
                    }
                     temp=temp.next;
                }
            }
        }
}
        
        public void deleteAt(int po)
        {
            if(po==1)
            {head=head.next;head.prev=null;}
            else
            {  int count=2;
            node temp=head.next;
            while(temp!=null)
            {
                if(count==po)
                    break;
                count++;
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            if(po!=c)
            temp.next.prev=temp.prev;
            }
        }
}
class doubly
{
    public static void main(String args[])
    {
        int[] a;
        doublyLinkedList d=new doublyLinkedList();
        d.add(5);
        d.add(15);
        d.add(20);
        d.disp();
        System.out.println("The element is present at index "+d.search(15));
        d.insertAt(3, 10);
        d.disp();
        d.deleteAt(1);
        d.disp();
        System.out.println("The element is present at index "+d.search(15));
        System.out.println(d.RetrieveAtIndex(1));
        a=d.getArray();
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
        
    }
            
}
