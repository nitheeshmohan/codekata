
//mam, i used the space variable so that 'complexity in knowing
//whether que is full or empty' is low.
import java.io.*;
import java.util.*;
class cir
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner s=new Scanner(System.in);
        circular c=new circular();
        do{
             System.out.println("1.Enque\n2.deque\n3.display");
               System.out.println("Enter your choice");
            i=s.nextInt();
            switch(i)
            {
                case 1:
                {
                    System.out.println("Enter element to be inserted");
                    j=s.nextInt();
                    c.enque(j);
                    System.out.println("The element "+j+" is inserted");
                    break;
                }
                case 2:
                    System.out.println("The dequed element is "+c.deque());
                    break;
                case 3:
                    c.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(i<=3);
    }
  }
     class circular 
    {
        public int size,rear=0,front=0,sp;
        public int[] a;
       Scanner s=new Scanner(System.in);
        public circular()
        {  System.out.println("Enter the size of queue");
            size=s.nextInt();
            a=new int[size];
            sp=size;
        }
        public void enque(int i)
        {
                if(sp>0)
                { a[rear++%size]=i;sp--;}
                else 
                    System.out.println("The que is full...");
        }       
        public int  deque()
        {
            if(sp==size)
            {System.out.println("The que is empty..");return 0;}
            else
            {  
                sp++;
                return a[front++];
            }
        }
        public void display()
        {
            int i;
            if(sp==size)
                System.out.println("The que is empty..");
            else 
            { i=front;
                while(i!=rear)
                    System.out.println(a[i++%size]+" ");
            } 
      }
    }
