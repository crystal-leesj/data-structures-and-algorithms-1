package fizzbuzztree;

import Tree.BinaryTree;
import Tree.Node;

public class FizzBuzzTree {

    public static void main (String[] args){
        BinaryTree test = new BinaryTree();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(15);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;


//        Node node = fizzBuzzTree(n1);
        //the order in which we print
        System.out.println(test.print(test.inOrder(fizzBuzzTree(n1))));
    }

    public static Node fizzBuzzTree(Node root){
        if(root != null) {
            fizzBuzzTree(root.left);
            fizzBuzzTreeProcess(root);
            fizzBuzzTree(root.right);
        }
        return root;
    }

    public static void fizzBuzzTreeProcess(Node root){

            if((int)root.data % 3 == 0 && (int) root.data % 5 == 0){
                root.data = "FizzBuzz";
            }
            else if((int)root.data % 3 == 0){
                root.data = "Fizz";
            }
            else if((int)root.data % 5 == 0){
                root.data = "Buzz";
            }
    }

}
