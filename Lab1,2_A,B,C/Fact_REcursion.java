import java.util.Scanner;
public class Fact_REcursion {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number: ");
    int n=sc.nextInt();
    System.out.println(fact(n));
} 
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }

}
