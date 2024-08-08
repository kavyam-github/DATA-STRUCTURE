import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements of array");
            arr[i]=sc.nextInt();
        }
        int last=n-1,count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("array already sorted");
        }
        else{
            last--;
        }
        System.out.println("array sorting completed");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            System.out.println(" ");
        }   
 }

}