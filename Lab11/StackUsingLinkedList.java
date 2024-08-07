public class StackUsingLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node first;
    int size = 0;

    public void push(int data) {
        Node n1 = new Node(data);

        if (first == null) {
            first = n1;
            return;
        } else {
            n1.next = first;
            first = n1; 
        }
        size++;
    }

    public int pop() {
        if (first == null) {
            System.out.println("This is empty");
            return -1;
        }

        int ans = first.data;
        first = first.next;
        size--;

        return ans;
    }

    public void peep(int index) {
        if (first == null) {
            System.out.println("this is empty");
            return;
        }
        Node temp = first;

        if(size <= index || index < 0){
            System.out.println("index does not exists");
            return;
        }
        
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
            System.out.println(temp.data);
    }

    public void printData() {
        Node temp = first;

        if (first == null) {
            System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList sl1 = new StackUsingLinkedList();

        sl1.push(1);
        sl1.push(2);
        sl1.push(3);
        sl1.push(4);
        sl1.printData();

        sl1.pop();
        sl1.printData();

        sl1.peep(9);
        sl1.printData();

    }
}
