import java.util.*;
class invite{
    
    public static void main(String args[]){
        
        int n=new Scanner(System.in).nextInt();
        int[] strong=new int[n];
        int[] beauty=new int[n];
        ArrayList<Integer> invited=new ArrayList<Integer>();
        int[] check=new int[n]; //to avoid duplicates
        for(int i=0;i<n;i++){
            check[i]=0;
        }
        for(int i=0;i<n;i++){
            strong[i]=new Scanner(System.in).nextInt(); //getting strong and beauty of each person
            beauty[i]=new Scanner(System.in).nextInt();
            for(int j=0;j<i;j++){
                if(!((strong[i]<=strong[j]&&beauty[i]>=beauty[j])||(strong[i]>=strong[j]&&beauty[i]<=beauty[j]))) //checking if people hate each other
                {
                    
                    if(check[i]==0){
                        check[i]=1;
                        invited.add(i);
                    }
                    if(check[j]==0){
                        check[j]=1;
                        invited.add(j);
                    }
                }
                
            }
        }
        
        for(int i=0;i<invited.size();i++){
            invited.set(i,invited.get(i)+1);   //since index starts from 0, v need to add one to all
        }
        
      
        System.out.println("The invited guests are"+invited);//printing invited guests numbers
    }
    
}
