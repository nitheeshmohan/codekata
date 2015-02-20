import java.util.*;
class negative
{
	public static void main(String args[])
	{	
	int[] a;
	int i,n,s1=0;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	a=new int[i];
	for(int j=0;j<i;j++)
	{
		n=s.nextInt();
		if(n>0)
		a[s1++]=n;	
	}
	for(int j=0;j<s1;j++)
	System.out.println(a[j]+" ");
}
}
