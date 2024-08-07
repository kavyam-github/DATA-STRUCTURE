package Lab13;

import java.util.Scanner;

public class Cir_Ins_First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}

class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
        this.link=link;
    }
}

class Linkedlist{
    Node first;
    Node last;
public void Cir_Ins_First(int data){
    Node newNode= new Node(data);
    if(first==null){
        newNode.link = newNode;
        first=newNode;
        last=newNode;
    }
    else{
        newNode.link=first;
        last.link=newNode;
        first=newNode;   
    }
}

public void Cir_Ins_Last(int data){
    Node newnode=new Node(data);
    if (first==null){
        newnode.link=newnode;
        first=newnode;
        last=newnode;
    }
    else{
        newnode.link=newnode;
        last.link=newnode;
    }
}



}