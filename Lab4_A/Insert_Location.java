package Lab4_A;

import java.util.Scanner;

public class Insert_Location {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int a=sc.nextInt();
        int arr[] = new int[a];
        System.out.println("enter element of array: ");
        for(int i=0;i<a;i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("enter location where to insert number: ");
        int location =sc.nextInt();
        System.out.println("enter number you want to insert: ");
        int num=sc.nextInt();
        int index=0;
        int temp[]=new int[a+1];
        for(int i=0;i<a;i++){
            if(i<location){
                temp[i]=arr[index];
                index++;
            }
            else if(i==location){
                temp[i]=num;
            }
            else{
                temp[i]=arr[index];
                index++;

            }
        }
        System.out.println("new array after inserting the num: ");
        for(int i=0;i<a+1;i++){
            System.out.println(temp[i]+" ");
        }
    }
}
