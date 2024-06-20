import java.util.Scanner;
public class display_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i]=sc.nextInt();
        }
        System.out.println("\n entered a number");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        }
    }

