import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements of array: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
        }
        System.out.println("array sorting completed");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            System.out.println(" ");
        }

    }
}
