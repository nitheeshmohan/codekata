import java.util.*;
class majorant
{
    public static void  main(String args[])
    {
         findMajorant f=new findMajorant();
         f.getInput();
         f.showResult();
    
    }
}
class findMajorant
{
    Scanner s =new Scanner(System.in);
    private int[] a;
    private int size,majorant=0;
    public findMajorant()
    {
        System.out.println("Enter the size of array");
        size=s.nextInt();
        a=new int[size];
    }
    public void getInput()
    {
     
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++)
            a[i]=s.nextInt();
    }
    public void showResult()
    {
          int s1,b=0;
        for(int i=0;i<size;i++)
        {
            s1=0;
            for(int j=0;j<size;j++)
                if(a[i]==a[j])
                    s1++;
            if(s1>=((size/2)+1)&&(s1>b))
            {
                b=s1;
                majorant=a[i];
            }
        }
        if(majorant==0)
            System.out.println("The majorant does not exists");
        else
            System.out.println("The majorant is "+majorant);
    }
}
