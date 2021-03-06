package Tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(9);

        //expected {1,2,4,5,3,6,7}
        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        Node node = new Node (1);
        add(n1,node);
BinaryTree test = new BinaryTree();
//        search(n1,10);
//        System.out.println(add(n1,node));

        System.out.println(isBinarySearch(n1));
    }




    public static void add (Node root, Node node){

        if(root.left == null && (int) root.data >= (int) node.data){
            root.left = node;
        }
        else if(root.right == null && (int) root.data < (int) node.data){
            root.right = node;
        }
        else if((int) root.data >= (int) node.data) {
            add(root.left, node);
        }
        else if((int) root.data < (int) node.data){
            add(root.right, node);
        }
    }

    public static Node search (Node root, int value){
        Node result = null;
       if((int)root.data == value){
           result = root;
       }
       else if((int) root.data>=value){
          result = search(root.left, value);
       }
       else if((int) root.data<= value){
           result = search(root.right, value);
       }
        return result;
    }

    public static boolean isBinarySearch(Node root){
        if(root == null){
            return false;
        }
        while(root != null){
            if((int) root.right.data > (int)root.left.data && (int) root.left.data< (int) root.right.data ){
                return true;
            }else if( (int) root.left.data> (int) root.right.data && (int) root.right.data< (int) root.left.data){
                return false;
            }
            isBinarySearch(root.left);
            isBinarySearch(root.right);

        }
        return false;
    }
}
