//to return Strings inside a sentence which are anagrams


import java.util.*;
class anagrams{
    public static void main(String args[])
    {
        String s=new Scanner(System.in).nextLine();
        String[] p=s.split(" ");
        for(int i=0;i<p.length;i++)
            for(int j=i+1;j<p.length;j++)
                if(check(p[i],p[j]))
                    System.out.println("These words are anagrams --"+p[i]+" & "+p[j]+"--");
   }
    public static boolean check(String a,String b){
        int[] reg=new int[122];
        int flag=0;
        for(int i=0;i<27;i++)
            reg[i]=0;
        for(int i=0;i<a.length();i++)
            reg[(int)(a.charAt(i))]=1;
        
        for(int i=0;i<b.length();i++)
            if(reg[(int)(b.charAt(i))]==0){
                 flag=1;break;
            }
             
        return flag==0&& (a.length()==b.length());
    }
}
