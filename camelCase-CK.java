import java.util.*;
public class camelcase {
    public static void main(String args[]){
        
        String[] p=new Scanner(System.in).nextLine().toLowerCase().split(" |\\_");
        String s="";
        for(String i:p)
            s=s+(i.substring(0,1).toUpperCase()+i.substring(1,i.length()));
         System.out.println(s);
    }
 
 
 
 
}
