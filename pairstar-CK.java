//program to insert star if two adjacent characters are same


import java.util.*;

class pair{
    public static void main(String args[]){
        
        String s=new Scanner(System.in).next();
        System.out.println(pairstar(s));
        
    }
    public static String pairstar(String s){
        String s1="";
        for(int i=0;i<s.length()-1;i++){
            if(i==s.length()-2){
                s1=s1+s.charAt(i)+'*'+s.charAt(i+1);
            }
            
            else if(s.charAt(i)==s.charAt(i+1)){
                s1=s1+s.charAt(i)+'*';
            }
            else{
                s1=s1+s.charAt(i);
            }
            
        }
        return s1;
    }
}
