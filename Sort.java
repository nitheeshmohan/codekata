class sorting
{
class node
{
    public int data;
    public node next;
}
private node head=null;
private node tail=null;
public void add(int n)
{
    node p=new node();
    p.data=n;
    p.next=null;
    if(head==null)
    {head=p;tail=p;}
    else
    {
        tail.next=p;tail=p;
    }
   sort();
}
private void sort()
{
    node temp=head;
    node temp1;
    while(temp!=null)
    {
        temp1=temp.next;
        while(temp1!=null)
        {
                if(temp.data>temp1.data)
                {
                    int i=temp.data;
                    temp.data=temp1.data;
                    temp1.data=i;
                }
                temp1=temp1.next;
        }
        temp=temp.next;
    }
}
public void disp()
{
    node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
}
}
class sort
{
    public static void main(String args[])
    {
        sorting s=new sorting();
        s.add(20);
        s.add(10);
        s.add(5);
        s.disp();
        
                
    }
}
