package linkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(15);
//        list.insertFirst(20);
//        list.insertLast(25);
//        list.insert(30, 2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();


//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(15);
//        list.insertFirst(20);
//        list.insertLast(50 , 2);
//        list.insert(30, 2);
//
//        list.display();

        CLL list = new CLL();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.display();
        list.delete(15);
        list.display();



    }
}
