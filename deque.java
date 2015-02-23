class dequeue
{
    class node
    {
        public int data;
        public node next;
    }
    private node front;
    private node rear;
    public void enque(String s,int n)
    {
        node p=new node();
        p.data=n;
        p.next=null;
        if(front==null)
        {front=p;rear=p;}
        else{
        if(s.equals("front")||(s.equals("FRONT")))
        {
           p.next=front;front=p;
        }
        else if(s.equals("rear")||(s.equals("REAR")))
        {
            rear.next=p;rear=p;
        }
         else
            {
                System.out.println("\nInvalid position");
            }
        }
    }
    public void deque(String s)
    {
        try{
            if(s.equals("front")||s.equals("FRONT"))
             {
                    front=front.next;
             }
            else if(s.equals("rear")||s.equals("REAR"))
            {
                node temp=front;
                while(temp.next!=rear)
                temp=temp.next;
                temp.next=null;
                rear=temp;
            }
            else
            {
                System.out.println("\nInvalid position");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("the que is empty");
        }
             
    }
    void display()
    {
        try{
        node temp=front;
        node temp1=front.next;
       while(temp!=null)
       {System.out.print(temp.data+" ");temp=temp.next;}
       
        }
        catch(NullPointerException e)
        {
            System.out.println("the que is empty");
        }
    }
}
class deque
{
    public static void main(String args[])
    {
        dequeue d=new dequeue();
        d.enque("front", 10);
        d.enque("front", 20);
        d.enque("REAR", 20);
        d.enque("rear", 30);
        d.display();
        d.deque("FRONT");
        d.deque("back");
        d.display();
    }
}
