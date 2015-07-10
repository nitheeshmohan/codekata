import java.util.*;
class rotateArray{
    public static void main(String args[]){
        String s=new Scanner(System.in).next();
        int count=0;
        for(int i=0;i<s.length()-2;i++)
            if(s.charAt(i)=='('&&s.charAt(i+1)==')')
                count+=2;
        System.out.println("The max length is "+count);
    }
}
