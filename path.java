import java.util.*;
class path
{
    public static void main(String args[])
    {
        path1 p1=new path1();
        p1.generate();
    }
}
class path1
{
    Scanner s= new Scanner(System.in);
    public int m,n;
    public path1()
    {
        System.out.println("Enter the n and m value");
        n=s.nextInt();
        m=s.nextInt();
    }
    public void generate()
    {
        while(n!=m)
        {
        if(m>=(n*2))
        {n=n*2;System.out.print(n+" " );}
        else if((n+2)<=m)
        { n=n+2;System.out.print(n+" " );}
        else if(n+1<=m)
         { n=n+1;System.out.print(n+" " );}
         }
}
}
