import java.util.*;

class swapOddEven{
    public static void main(String args[]){
        String s1=new Scanner(System.in).next();
        StringBuilder s=new StringBuilder(s1);
        for(int i=0;i<s1.length()-1;i=i+2){
            char c=s.charAt(i);
            s.setCharAt(i, s.charAt(i+1));
            s.setCharAt(i+1,c);
            
         }
     System.out.println("The string is "+s);   
    }
}
