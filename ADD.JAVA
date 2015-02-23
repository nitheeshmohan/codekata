import java.io.*;
import java.util.*;
class sequence
{

class node
{
        public int data;
	public node next;
}
       


        private node top=null;
        private  int c=0;
        private float sum=0,count=0;
        public sequence()throws IOException
        {
                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                  String s1;
                  /* sequence d=new sequence();*/
                  System.out.println("Enter your sequence. press enter to stop ");
                  s1=br.readLine();
                  int k=0;
                   for(int i=0;i<s1.length();i++)
                    {
                            if(s1.charAt(i)==' ')
                              {
                                    sum=sum+Integer.parseInt(s1.substring(k,i));
                                      push(Integer.parseInt(s1.substring(k,i)));
                                      count++;
                                      k=i+1;
                               }
                            else if(i==(s1.length()-1))
                            {
                                    sum=sum+Integer.parseInt(s1.substring(k,i+1));
                                      push(Integer.parseInt(s1.substring(k,i+1)));
                                      count++;
                            }
                    }
        }
	public void push(int n)
	{
		node p=new node();
		p.data=n;
		p.next=null;
		if(top==null)
		{top=p;c++;}
		else
		{p.next=top;top=p;c++;}
	}
       
      public void display()
      {
          float avg,s,c1;
          s=sum;c1=count;
          avg=sum/count;
          System.out.println("The sum is "+sum+"The average is "+avg);
                  
      }
}
class cmd
{
    public static void main(String args[])throws IOException
    {
     sequence s1;
        s1 = new sequence();
     s1.display();
        
    }
}
