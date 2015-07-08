import java.util.*;
class rotateArray{
public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     int i=0,n=s.nextInt(),k=s.nextInt();
     int[] a=new int[n];
     for(int l=0;l<n;l++)
         a[l]=s.nextInt();
     while(i++<k){
         int temp=a[n-1];
         for(int j=n-1;j>=1;j--)
             a[j]=a[j-1];
         a[0]=temp;
         
     }
     System.out.print(Arrays.toString(a));

    
   }
}
