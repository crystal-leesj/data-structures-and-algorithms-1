package graph;

public class Edge <T> {
    private T weight;
    private GraphNode start;
    private GraphNode end;

    //constructor
    public Edge (T weight, GraphNode start, GraphNode end){
        this.weight= weight;
        this.start = start;
        this.end = end;
    }

    public T getWeight() {
        return weight;
    }

    public GraphNode getStart() {
        return start;
    }

    public GraphNode getEnd() {
        return end;
    }

}
