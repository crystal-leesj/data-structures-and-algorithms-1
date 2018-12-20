package Tree;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);


        //expected {1,2,4,5,3,6,7}
        n1.left = n2;
        n1.right = n3;

        n2.left = n4;

//        System.out.println(n1.left.data);
//        System.out.println(n1.right.data);
//        System.out.println(sum(n1));
//        breadthFirstTraversal(n1);
        System.out.println(maxValue(n1));
//          maxValue(n1);


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

    public static void breadthFirstTraversal(Node root){
        Queue<Node> breadth = new Queue();

        breadth.enqueue(root);
        while (!breadth.isEmpty()){
            //save by deq
            Node save =  breadth.dequeue();
            //print
            System.out.println(save.data);
            //if statements
            if(save.left != null){
                breadth.enqueue(save.left);
            }
            if (save.right != null){
                breadth.enqueue(save.right);
            }
        }
    }

    public static int maxValue (Node root){
        if (root == null){
            return Integer.MIN_VALUE;
            //initially going to
            // return 0 but what if the root has negative values?
        }
        int currentVal = (int)root.data;

            int L = maxValue(root.left);
            int R = maxValue(root.right);
           return Math.max(Math.max(L, R), currentVal);

    }







    //HELPER METHODS
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
