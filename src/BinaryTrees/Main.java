package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
////        tree.display();
//        tree.prettyDisplay();

        BST tree = new BST();
        int[] nums = {1,3,4,5,6,7, 12, 24, 36, 48, 60, 50, 45};
        tree.populate(nums);
        tree.display();
    }
}
