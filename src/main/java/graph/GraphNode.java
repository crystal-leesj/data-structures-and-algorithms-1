package graph;

import stacksandqueues.Node;

import java.util.*;

public class GraphNode<T> {
    public T data;
    public List<GraphNode> neighbors;

    //constructor
    public GraphNode (T data){
        this.data = data;
        this.neighbors= null;
    }
    //Adds a new node to the graph - Takes in the value of that node - Returns the added node
    public GraphNode AddNode(T data){
        //instantiate GraphNode
        GraphNode node = new GraphNode(data);
        //add the graph
        this.neighbors.add(node);
        return node;
    }

}
