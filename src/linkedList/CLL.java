package linkedList;

public class CLL {


    private Node head;
    private Node tail;

    public CLL() {
        head = null;
        tail = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("Head");
    }

    public void delete(int value){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.val==value){
            head = temp.next;
            tail.next = head;
            return;
        }

        do{
            Node n=temp.next;
            if(n.val==value){
                temp.next = n.next;
                return;
            }
            temp = temp.next;
        }while(temp != head);

    }


    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }


    }
}

