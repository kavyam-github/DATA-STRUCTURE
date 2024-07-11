package Lab7;

import java.util.Scanner;

public class Stack_opt {
    int arr[], top;

    Stack_opt(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top = top + 1;
            arr[top] = data;
            System.out.println("element entered successfully");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack undeflow");
        }
        top = top - 1;
        System.out.println("element removed successfully");
        return arr[top + 1];
         }

         public void peep(int i){
            if(top-i+1<=0){
                System.out.println("stack underflow");
            }
            else{
                System.out.println("peep"+arr[top-i+1]);
            }
         }

         public void change(int i){
            if(top-i+1<=0){
                System.out.println("stack underflow");
            }
            else{
                System.out.println("peep"+arr[top-i+1]);
            }
         }

    public void display() {
        if (top == -1) {
            System.out.println("stack is empty: ");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack_opt stack=new Stack_opt(size);
        stack.push(50);
        stack.push(80);
        stack.push(48);
        stack.pop();
        stack.peep(48);
        stack.change(65);

        stack.display();

    } 
}