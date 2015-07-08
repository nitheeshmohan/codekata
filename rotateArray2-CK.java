//Effiecient method
import java.util.*;
class rotateArray{
public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt(),k=s.nextInt(),i=0,l=k,a[]=new int[n];
    
      while(i++<=n-1)
         a[l++%n]=s.nextInt();
         
     System.out.println(Arrays.toString(a));
     
}
}
