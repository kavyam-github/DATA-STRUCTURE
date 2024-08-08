package Lab18;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("--------enter elements to array: = " + i);
            arr[i]=sc.nextInt();
        }
        System.out.println("---------enter element to search-----------");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("------------element found at index: "+i);
                return;
            }
            
        }
        System.out.println("-------------element not found....Invalid search----------");
    }
}
