package linkedList;

public class DLL {

    private Node head;
    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display(){
        Node newNode = head;
        Node last = null;
        while(newNode != null){
            System.out.print(newNode.val + "->");
            last = newNode;
            newNode = newNode.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse order");

        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val, int index){
        Node newNode = new Node(val);
        Node last = head;
        newNode.next = null;
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public Node find(int value){
        Node node=head;
        while (node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert(int val, int index){
        Node p = head;
        if(index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;
        if(newNode.next!=null){
            newNode.next.prev=newNode;
        }
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
