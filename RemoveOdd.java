import java.util.*;
class count
{
    public static void main(String args[])
    {
        times t=new times();
        t.add();
        t.show();
        
    }
    
}
class times
{
    Scanner s=new Scanner(System.in);
    private int[] a,b;
    private int size;
    public times()
    {
        System.out.println("Enter the size of array");
        size=s.nextInt();
        a=new int[size];
        b=new int[size];
    }
    public void add()
    {
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
            a[i]=s.nextInt();
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                if(a[i]==a[j])
                    b[i]++;
         
    }
    public void show()
    {
        for(int i=0;i<size;i++)
            if(b[i]%2==0)
                System.out.print(a[i]+" ");
    }
    
}
