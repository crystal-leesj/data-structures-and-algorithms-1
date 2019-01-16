package treeintersection;

import Tree.Node;

import java.security.GuardedObject;
import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {


    public static void treeIntersectionPopulate(Set<Object> set,Node root1, Node root2){
            if(root1!= null && root2!= null){
                if(root1.data == root2.data){
                    set.add(root1.data);
                    treeIntersectionPopulate(set, root1.left, root2.left);
                    treeIntersectionPopulate(set, root1.right,root2.right);
                }else {set.add("No similar points");}
        }
    }
    public  Set<Object> treeIntersection(Node root1, Node root2){

        Set<Object> set = new HashSet<>();
        treeIntersectionPopulate(set, root1,root2);
        return set;
    }

}
