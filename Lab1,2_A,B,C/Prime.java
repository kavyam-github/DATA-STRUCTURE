import java.util.*;

public class Prime {
    
 public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter ");
       int count=0;
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           if(n%i==0){
               count=count+1;
           }
       }
       if(count<=2){
        System.out.println("prime");
       }
       else{
        System.out.println(" no prime");
}
}
}

