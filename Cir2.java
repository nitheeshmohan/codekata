import java.util.*;
class cir2
{
    public static void main(String args[])
    {
        cir c=new cir();
        c.enque(1);
        c.enque(2);
        c.enque(3);
        c.enque(4);
        System.out.println("The element "+c.deque()+" is dequed");
        c.enque(5);
        c.enque(6);
        c.display();
        c.enque(7);
        c.enque(8);
        c.enque(9);
        c.enque(10);
        c.enque(11);
   // c.enque(60);
       /* System.o;ut.println("The d is"+c.deque());
        c.enque(50);
        c.enque(60);
        System.out.println("The d is"+c.deque()+"spa"+c.sp);*/
        c.display();
        
    }
}
class cir
{
    Scanner s=new Scanner(System.in);
    public int size,sp,front=0,rear=-1;
    private int[] a;
    public cir()
    {
        System.out.println("Enter the size of the array");
        int ss=s.nextInt();
        size=ss;
        sp=size;
        a=new int[size];
    }
    public void enque(int n)
    {
        int[] b;
        int z=0;
        if(sp<=0)
        {
            System.out.println("The que is full...extending queue and inserting element");
            z=0;
            size=size*2;
            sp=size/2;
            b=new int[size/2];
            int i=front;
            while( i%size!=rear)
             {
                 b[z++]=a[i++%size];
             }
            
             b[z++]=a[i++%(size/2)];
             a=Arrays.copyOf( b,size*2);
             front=0;
             rear=(size/2)-1;
             enque(n);
        }
        else
        {
            a[++rear%size]=n;
           sp--;
           System.out.println("The element "+n+" inserted");
        }
    }
    public int deque()
    {
        if(sp==size)
        {
            System.out.println("The que is empty");
            return 0;
        }
        else
        {
            sp++;
            return a[front++];
        }
    }
    public void display()
    {
         if(sp==size)
        {
            System.out.println("The que is empty");
            
        }
         else
         {
             int i=front;
             while(i!=rear)
             {
                 System.out.println(a[i++%size] +" ");
             }
                             System.out.println(a[i++%size] +" ");

         }
    }
}
       
