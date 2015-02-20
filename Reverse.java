import java.util.*;
class reverse
{
	public static void main(String  args[])
	{
                stack s=new stack();
                s.push();
                s.pop();
	}
}
class stack
{
	public int top=-1,size;
	private final int[] a;
	Scanner s=new Scanner(System.in);
	public stack()
	{
		System.out.println("Enter the size ");
		size=s.nextInt();
		a=new int[size];
	}
	public void push()
	{
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++)
		a[++top]=s.nextInt();
	}
	public void pop()
	{
            for(int i=top;i>=0;i--)
                 System.out.print(a[i]+" ");
            
	}
}
