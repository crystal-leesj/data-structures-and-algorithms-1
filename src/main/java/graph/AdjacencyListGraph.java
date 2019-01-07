package graph;

import javafx.beans.binding.SetExpression;

import java.util.*;

public class AdjacencyListGraph<T> {
    public Set<GraphNode> adjacencyList;
    public Set<Edge> edges;

    public AdjacencyListGraph() {
        this.edges = new HashSet<>();
        this.adjacencyList = new HashSet<>();
    }

    //Adds a new node to the AdjacencyListGraph - Takes in the value of that node - Returns the added node
    public GraphNode addNode(T data) {
        //instantiate GraphNode and pass in data **graph thus far without any connections
        GraphNode node = new GraphNode(data);
        //returning node without neighbors

        //add node to the node list
        adjacencyList.add(node);

        return node;
    }

    //Adds a new edge between two nodes in the AdjacencyListGraph - Include the ability to have a “weight” - Takes in the two nodes to be connected by the edge - Both nodes should already be in the graph


    public void AddEdge(T weight, GraphNode start, GraphNode end) {

        //instantiate edge
        Edge edge = new Edge(weight, start, end);
        //add to edge set
        edges.add(edge);
        //makes start and end neighbors since they have weight which connects them (undirected graph/bi-dire)
        start.neighbors.add(end);
        end.neighbors.add(start);
    }

    //Returns all of the nodes in the graph as a collection (set, list, or similar)
    public Set getNodes() {
        return adjacencyList;
    }

    //Returns a collection of nodes connected to the given node
    //Takes in a given node
    //Include the weight of the connection in the returned collection
    public Set GetNeighbors(GraphNode node) {
        //create a empty set
        Set<Edge> newSet = new HashSet<>();

        //iterate through edges set //if start = node,  store the edge in new set
        for (Edge edges : edges) {
            if (edges.getStart() == node) {
                newSet.add(edges);
            }
        }
        //return that set
        return newSet;

    }

    //Returns the total number of nodes in the graph
    public int size() {
        return adjacencyList.size();
    }

}
