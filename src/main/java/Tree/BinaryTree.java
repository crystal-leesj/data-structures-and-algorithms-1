package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        //expected {1,2,4,5,3,6,7}
        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;
//        System.out.println(n1.left.data);
//        System.out.println(n1.right.data);
        System.out.println(sum(n1));

    }

    //return the list/create
    public static List<Node> preOrder(Node root){
        //Root, Left, Right
        List<Node> list = new ArrayList<Node>();
        preOrderPopulate(list, root);
        return list;
    }
    public static void preOrderPopulate(List<Node> list, Node root){
        if(root != null){
            list.add(root);
            preOrderPopulate(list, root.left);
            preOrderPopulate(list, root.right);
        }
    }

    //return the list/create
    public static List<Node> inOrder(Node root){
        //Left, Root, Right
        List<Node> list = new ArrayList<Node>();
        inOrderPopulate(list, root);
        return list;
    }
    public static void inOrderPopulate(List<Node> list, Node root){
        if(root != null){
            inOrderPopulate(list,root.left);
            list.add(root);
            inOrderPopulate(list,root.right);
        }
    }

    //return the list/create
    public static List<Node> postOrder(Node root){
        //Left, Right, Root
        List<Node> list = new ArrayList<Node>();
        postOrderPopulate(list,root);
        return list;
    }
    public static void postOrderPopulate(List<Node> list, Node root){
        if(root != null){
            postOrderPopulate(list,root.left);
            postOrderPopulate(list,root.right);
            list.add(root);
        }
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        return sum(node.left)+sum(node.right)+(int)node.data;
    }

    public static String print(List<Node> list){
        String results = "";
        for (int i = 0; i <list.size() ; i++) {
            results+= " " + list.get(i).data;
        }
        return results;
    }

}
