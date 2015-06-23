import java.util.*;
class stamps{
    public static void main(String args[]){
        
        int n=new Scanner(System.in).nextInt();
        System.out.println("The number of stamps are"+"\n10p:"+n/10+"\n7p:"+((n%10)/7)+"\n1p"+(((n%10)%7)/1));
        
    }
}
