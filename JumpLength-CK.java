import java.util.*;
class rotateArray{
    public static void main(String args[]){
        int n=new Scanner(System.in).nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=new Scanner(System.in).nextInt();
        if(Jump(a,n))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean Jump(int[] a,int n){          
        int index=0;
        while(true){
            
            index=index+a[index];
            if(index==n-1)
                return true;
            if((a[index]==0&&index!=n-1)||(index>n-1))
                return false;

        }
    }
}
