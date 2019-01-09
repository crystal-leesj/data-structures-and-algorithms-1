package graph;

import stacksandqueues.Queue;
import stacksandqueues.Stack;

import java.util.*;

public class AdjacencyListGraph <T> {
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

        //add node to the node set
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

    //breadth-first traversal method that accepts a starting node, return a collection of nodes in the order they were visited. Display the collection.

    public static List<GraphNode> breadthFirstTraversal(GraphNode start){
        List<GraphNode> visited = new ArrayList<>();
        Queue<GraphNode> breadth = new Queue();

        //add to the queue
        breadth.enqueue(start);

        //add to the collection
        visited.add(start);

        while(!breadth.isEmpty()){
            GraphNode save = breadth.dequeue();
                for(Object n: save.neighbors) {
                    if (!visited.contains(n)) {
                        breadth.enqueue((GraphNode) n);
                        visited.add((GraphNode) n);
                    }
                }
        }
         return visited;
    }

        public static int search (AdjacencyListGraph graph, List<String> cities){
            Set<GraphNode> visited = new HashSet();
            Stack<GraphNode> dfs;
            int result = 0;
            //List<Boolan>

            for (GraphNode node : (Set<GraphNode>) graph.adjacencyList) {
                if (isEqual( node, cities)) {
                    dfs = new Stack();
                    visited.clear();

                    dfs.push(node);
                    visited.add(node);

                    while (dfs.peek() != null) {
                        GraphNode save = dfs.pop();

                        for (Edge n : (Set<Edge>) save.neighbors) {
                            if (!visited.contains(n.getEnd()) && isEqual(n.getEnd(), cities)) {
                                dfs.push(n.getEnd());
                                visited.add(n.getEnd());
                                result += (int) n.getWeight();
                            }
                            if (visited.size() == cities.size()) {
                                return result;
                            }
                        }
                    }
                }
                result = 0;
            }
            return result;
        }

        public static boolean isEqual(GraphNode s, List<String> ss){

            for(String str: ss){
                if(ss.equals(s.data)){
                    return true;
                }
            }
        return  false;
        }
}
