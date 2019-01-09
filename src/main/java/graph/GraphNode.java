package graph;

import java.util.*;

public class GraphNode<T> {
    public T data;
    public Set<Edge> neighbors;

    //constructor
    public GraphNode (T data){
        this.data = data;
        this.neighbors= new HashSet<>();
    }

    @Override
    public String toString(){
        return (String)this.data;
    }

}
