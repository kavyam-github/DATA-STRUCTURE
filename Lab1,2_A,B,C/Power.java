import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter first number: ");
         int a=sc.nextInt();
         System.out.println("enter second number: ");
         int b=sc.nextInt();
         int ans=1;
         for(int i=1;i<=b;i++){
            ans=ans*a;
         }       
         System.out.println("answer: "+ans);
        }
    }
