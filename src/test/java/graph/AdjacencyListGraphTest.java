package graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class AdjacencyListGraphTest {
    AdjacencyListGraph classToTest = new AdjacencyListGraph();

    @Test
    public void addNode() {
        GraphNode actual = new GraphNode(2);

        int expected = (int) classToTest.addNode(2).data;

        assertEquals(expected, actual.data);
    }

    //STARTING addEdgesTest
    @Test
    public void addEdge() {
        //to have access to edges hashset
        AdjacencyListGraph graph = new AdjacencyListGraph();

        GraphNode start = new GraphNode(1);
        GraphNode end = new GraphNode(2);
        int weight = 3;
        Edge edge = new Edge(weight, start, end);

        //calling the method and passing in the instantiated nodes and weight
        graph.AddEdge(weight, start, end);

        //checking if start and end are neigbors and if the edges set contain three as the edge
        boolean expected = start.neighbors.contains(end) && end.neighbors.contains(start);

        assertTrue(expected);
    }

    //STARTING getNodesTest
    @Test
    public void getNodesTrueTest() {

        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        classToTest.addNode(1);
        classToTest.addNode(2);
        classToTest.addNode(3);

        //instantiate an empty new set
        Set<Integer> nodeValues = new HashSet<>();

        //instantiate a set that contains the adjecencyList to loop through
        Set<GraphNode> n = classToTest.adjacencyList;

        //create an interator
        Iterator<GraphNode> it = n.iterator();
        //loop through the hash set
        while (it.hasNext()) {
            nodeValues.add((int) it.next().data);
        }
        assertTrue(nodeValues.containsAll(new HashSet<>(Arrays.asList(1, 2, 3))));

        Set<Integer> actual = new HashSet<>(Arrays.asList(1, 2, 3));
    }

    @Test
    public void getNodesEqualsTest() {

        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        classToTest.addNode(1);
        classToTest.addNode(2);
        classToTest.addNode(3);

        //instantiate an empty new set
        Set<Integer> nodeValues = new HashSet<>();

        //instantiate a set that contains the adjecencyList to loop through
        Set<GraphNode> n = classToTest.adjacencyList;

        //create an interator
        Iterator<GraphNode> it = n.iterator();
        //loop through the hash set
        while (it.hasNext()) {
            nodeValues.add((int) it.next().data);
        }

        Set<Integer> actual = new HashSet<>(Arrays.asList(1, 2, 3));

        assertEquals(nodeValues, actual);

    }
//STARTING GET NEIGHBORS TEST
    @Test
    public void GetNeighbors() {
        //this method returns a set of neighboring edges of the node that is passed in

        AdjacencyListGraph classToTest = new AdjacencyListGraph();
        GraphNode start = new GraphNode(1);
        GraphNode end = new GraphNode(2);
        int weight = 3;
        Edge edge = new Edge(weight,start,end);

        //addEdge to node
        classToTest.AddEdge(weight,start,end);

        //call the method on start to get all the neighbor edges of start
        Set<Edge> neighborEdges = classToTest.GetNeighbors(start);

        boolean actual = true;

        //check if the node end in edges set is a neighbor of node start
        //if isn't change actual to false

        for(Edge e : neighborEdges){
            //if start neighbors doesn't contain the end node that was instantiated return false
            if(!start.neighbors.contains(e.getEnd())){
                actual = false;
            }
        }
    assertTrue(actual);
    }


    //STARTING TEST FOR SIZE

    @Test
    public void sizeTest(){
        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        //create node
        //add to adjacency list
        GraphNode n1 = new GraphNode(3);
        classToTest.addNode(n1);

        //create node
        //add to adjacency list
        GraphNode n2 = new GraphNode(1);
        classToTest.addNode(n2);

        //create node
        //add to adjacency list
        GraphNode n3 = new GraphNode(6);
        classToTest.addNode(n3);

        int actual = classToTest.size();

        int expected = 3;

        assertEquals(expected,actual);

    }
}