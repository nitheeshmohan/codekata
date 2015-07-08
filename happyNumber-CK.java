import java.util.*;
class happyNumber{
    
    public static void main(String args[]){
        int a=new Scanner(System.in).nextInt(),s=0,b=a;
        while(a!=1){
            s=0;
        while(a>0){
            s=s+((a%10)*(a%10));
            a=a/10;
        }
       
        if(s==1){
            a=1;
            System.out.println("The number "+b+" is happy number");
            break;
        }
        else if(s==4){                     //since every unhappy number follows through numbers such as 4,16,20,37,i used one as breakpoint
            System.out.println("The number "+b+" is not happy number");
            a=1;
            break;
        }
        else a=s;
        }
        
    }
}
