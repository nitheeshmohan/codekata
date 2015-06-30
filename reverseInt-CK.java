import java.util.*;
class reverseInt{
    
    public static void main(String args[]){
        int n=new Scanner(System.in).nextInt();
        int j=0;
        while(n>=1){
            j=(j*10)+(n%10);
            n=n/10;
        }
        System.out.println(j);
        
    }
}
