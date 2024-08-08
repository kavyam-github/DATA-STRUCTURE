import java.util.Scanner;

public class BinarySearch {
       public static void main(String[] args) {
        System.out.println("enter size of array: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elements of array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to seach");
        int key=sc.nextInt();
        
        
           int left=0,right=n-1,middle=0;
            while (left<=right) {
                middle=((left+right)/2);
                if(arr[middle]==key){
                    System.out.println("element found at index="+middle);
                    return;
                }
                else if(key<arr[middle]){
                    right=middle-1;
                }
                else{
                    left=middle+1;
                }
            }
       
        System.out.println("element not found...Invalid search");
    }
}
