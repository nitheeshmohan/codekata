//to remove vowels


import java.util.*;
class removeVowels{
    public static void main(String args[]){
        StringBuffer s=new StringBuffer(new Scanner(System.in).next()).reverse();
        String a="";
        for(int i=0;i<s.length();i++)
            if(!((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')))
                a=a+s.charAt(i);
        
     System.out.println(a);
    }
            
}
