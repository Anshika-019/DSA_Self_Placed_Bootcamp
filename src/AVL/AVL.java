package AVL;


public class AVL {
        public class Node{
            private int value;
            private int height;
            private Node left;
            private Node right;

            public Node(int value){ // contracture
                this.value=value;
            }

            public int getValue(){

                return value;
            }
        }

        private Node root;
        public AVL(){

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
            return rotate(node);
        }

        private Node rotate(Node node){
            int balance=height(node.left)-height(node.right);
            if(balance>1){
                if(height(node.left.left)>=height(node.left.right)){
                    return rightRotate(node);
                }
                else{
                    node.left=leftRotate(node.left);
                    return rightRotate(node);
                }
            }
            if(balance<-1){
                if(height(node.right.right)>=height(node.right.left)){
                    return leftRotate(node);
                }
                else{
                    node.right=rightRotate(node.right);
                    return leftRotate(node);
                }
            }
            return node;
        }

        private Node rightRotate(Node p){
            Node c=p.left;
            p.left=c.right;
            c.right=p;
            p.height=Math.max(height(p.left),height(p.right))+1;
            c.height=Math.max(height(c.left),height(c.right))+1;
            return c;
        }

        private Node leftRotate(Node node){
            Node newRoot=node.right;
            node.right=newRoot.left;
            newRoot.left=node;
            node.height=Math.max(height(node.left),height(node.right))+1;
            newRoot.height=Math.max(height(newRoot.left),height(newRoot.right))+1;
            return newRoot;
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
        private void display(Node node, String details){
            if(node==null){
                return;
            }
            System.out.println(details+node.value);
            display(node.left,"Left child of "+node.getValue()+" : ");
            display(node.right,"Right child of"+node.getValue()+" : ");
        }


}
