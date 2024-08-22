package Lab21;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element of array: ");
            arr[i]=sc.nextInt();
        }
        MergeSort(arr,0,n-1);
        System.out.println("Sorting of array completed using MergeSort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
        public static void MergeSort(int arr[],int low,int high){
            if(low<high){
                int mid=((low+high)/2);
                MergeSort(arr, low, high);
                MergeSort(arr,mid+1, high);
                Merge(arr,low,mid,high);
            }
        }
        public static void Merge(int arr[],int low,int mid,int high){
            int n1=mid-low+1;
            int n2=high-mid;
            //temporary array
            int[] left=new int[n1];   
            int[] right=new int[n2];
            //copy data to temporary data
            for(int i=0;i<n1;i++){
                left[i]=arr[low+i];
            }
            for(int j=0;j<n2;j++){
                right[j]=arr[mid+1+j];
            }
            //merge back temp arr into arr[]
            int i=0,j=0,k=low;
            while(i<n1 && j<n2){
                if(left[i]<=right[j]){
                    arr[k]=left[i];
                    i++;
                }
                else{
                    arr[k]=right[j];
                    j++;
                }
                k++;
            }
            //copy remaining element left[]
            while (i<n1) {
                arr[k]=left[i];
                i++;
                k++;
            }
            //cppy remaining element right[]
            while (j<n2) {
                arr[k]=right[j];
                j++;
                k++;
            }
    }
}

