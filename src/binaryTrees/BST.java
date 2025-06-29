package binaryTrees;

public class BST {
    public class Node{
       private int value;
       private int height;
       private Node left;
         private Node right;

          public Node(int value){ // contracture
                this.value=value;
                this.height=1;
          }

          public int getValue(){
              return value;
          }
    }

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        else if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void populate(int[] nums){
        for(int i=-0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }
    private void populatedSorted(int[] nums,int start,int end){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        insert(nums[mid]);
        populatedSorted(nums,start,mid-1);
        populatedSorted(nums,mid+1,end);
    }

    public boolean balance(){
        return balance(root);
    }
    private boolean balance(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balance(node.left) && balance(node.right);
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of"+node.getValue()+" : ");
    }
}
