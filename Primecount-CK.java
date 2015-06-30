import java.util.*;
class countPrime{
    public static void main(String args[]){
        int a=new Scanner(System.in).nextInt(),c=0,b=new Scanner(System.in).nextInt();
        for(int i=a;i<=b;i++)
            if(isPrime(i))
              c++;
        System.out.println("The number of prime numbers between "+a+" and "+b+" is "+c);
    }
    public static boolean isPrime(int i){
        for(int j=2;j<i;j++)
            if(i%j==0)
                return false;
        return true;
    }
}
