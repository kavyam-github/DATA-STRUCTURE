package Lab11;

import java.util.Scanner;

public class Stack_fun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MylinkedList l1 = new MylinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
           
            System.out.println();
            System.out.print("Enter a choice: ");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    int a = sc.nextInt();
                    l1.push(a);
                    break;

                case 2:
                    int b = sc.nextInt();
                    l1.pop(b);
                    break;

               

            }
        }

    }
}

class Linked_List {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node first;

    public void push(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;

    }

    public void insertAtPosition(int data, int enteredpos) {
        Node newNode = new Node(data);
        int count = 0;

        Node temp = first;
        if (first == null) {
            first = newNode;
            return;
        }
        while (count != enteredpos) {
            temp = temp.link;
            count++;
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }

    public void pop(int data) {
        Node newNode = new Node(data);
        
        Node lastNode = first;
        while (lastNode.link != null) {
            lastNode = lastNode.link;

        }
        lastNode.link = null;

    }

    public void insertAtOrder(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        }
        if (first == null || newNode.data <= first.data) {
            newNode.link = first;
            first = newNode;

        }
        Node temp = first;
        while (temp.link != null && newNode.data >= temp.link.data) {
            temp = temp.link;

        }
        newNode.link = temp.link;
        temp.link = newNode;
    }

    public void deletePosition(int key) {

        Node temp;
        int count = 0;
        temp = first;

        if (first == null) {

            System.out.println("empty");

        }
        while (count != key) {
            temp = temp.link;
            count++;

        }
        temp.link = temp.link.link;
    }

    void displayList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
