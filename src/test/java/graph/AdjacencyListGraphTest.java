package graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class AdjacencyListGraphTest {
//STARTING ADD NODE TEST
    @Test
    public void addNodeSmall() {
        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        GraphNode n1 = classToTest.addNode(2);
        GraphNode n2 = classToTest.addNode(4);
        GraphNode n3 = classToTest.addNode(9);

        Set<Integer> expected = new HashSet<>();
        Set<GraphNode> n = classToTest.adjacencyList;
        //retrieve all the data in the adjacencylist
        Iterator<GraphNode> it = n.iterator();
        while (it.hasNext()){
            expected.add((int) it.next().data);
        }

        Set<Integer> actual = new HashSet<>(Arrays.asList(2, 4, 9));
        assertEquals(expected, actual);
    }
    @Test
    public void addNodeMedium() {
        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        GraphNode n1 = classToTest.addNode(2);
        GraphNode n2 = classToTest.addNode(4);
        GraphNode n3 = classToTest.addNode(9);
        GraphNode n4 = classToTest.addNode(11);
        GraphNode n5 = classToTest.addNode(5);
        GraphNode n6 = classToTest.addNode(19);

        Set<Integer> expected = new HashSet<>();
        Set<GraphNode> n = classToTest.adjacencyList;
        //retrieve all the data in the adjacencylist
        Iterator<GraphNode> it = n.iterator();
        while (it.hasNext()){
            expected.add((int) it.next().data);
        }

        Set<Integer> actual = new HashSet<>(Arrays.asList(2, 4, 9,11,5,19));

        assertEquals(expected, actual);
    }
    @Test
    public void addNodeLarge() {
        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        GraphNode n1 = classToTest.addNode(2);
        GraphNode n2 = classToTest.addNode(4);
        GraphNode n3 = classToTest.addNode(9);
        GraphNode n4 = classToTest.addNode(11);
        GraphNode n5 = classToTest.addNode(5);
        GraphNode n6 = classToTest.addNode(19);
        GraphNode n7 = classToTest.addNode(55);
        GraphNode n8 = classToTest.addNode(199);

        Set<Integer> expected = new HashSet<>();
        Set<GraphNode> n = classToTest.adjacencyList;
        //retrieve all the data in the adjacencylist
        Iterator<GraphNode> it = n.iterator();
        while (it.hasNext()){
            expected.add((int) it.next().data);
        }

        Set<Integer> actual = new HashSet<>(Arrays.asList(2, 4, 9,11,5,19,55,199));
        assertEquals(expected, actual);
    }

    //STARTING addEdgesTest
    @Test
    public void addEdgeSmallNumber() {
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

    @Test
    public void addEdgeMediumNumber() {
        //to have access to edges hashset
        AdjacencyListGraph graph = new AdjacencyListGraph();

        GraphNode start = new GraphNode(15);
        GraphNode end = new GraphNode(2);
        int weight = 3;
        Edge edge = new Edge(weight, start, end);

        //calling the method and passing in the instantiated nodes and weight
        graph.AddEdge(weight, start, end);

        //checking if start and end are neigbors and if the edges set contain three as the edge
        boolean expected = start.neighbors.contains(end) && end.neighbors.contains(start);

        assertTrue(expected);
    }

    @Test
    public void addEdgeLargeNumber() {
        //to have access to edges hashset
        AdjacencyListGraph graph = new AdjacencyListGraph();

        GraphNode start = new GraphNode(155);
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
    @Test
    public void getNodesEqualsMediumTest() {

        AdjacencyListGraph classToTest = new AdjacencyListGraph();

        classToTest.addNode(1);
        classToTest.addNode(2);
        classToTest.addNode(3);
        classToTest.addNode(23);

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

        Set<Integer> actual = new HashSet<>(Arrays.asList(1, 2, 3,23));
        assertEquals(nodeValues, actual);
    }


//STARTING GET NEIGHBORS TEST
    @Test
    public void GetNeighborsSmallNumber() {
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
    @Test
    public void GetNeighborsMediumNumber() {
        //this method returns a set of neighboring edges of the node that is passed in

        AdjacencyListGraph classToTest = new AdjacencyListGraph();
        GraphNode start = new GraphNode(1);
        GraphNode end1 = new GraphNode(2);
        GraphNode end2 = new GraphNode(2);
        GraphNode end3 = new GraphNode(2);
        GraphNode end4 = new GraphNode(2);


        Edge edge1 = new Edge(1,start,end1);
        Edge edge2 = new Edge(3,start,end2);
        Edge edge3 = new Edge(4,start,end3);
        Edge edge4 = new Edge(11,start,end4);

        //addEdge to node
        classToTest.AddEdge(1,start,end1);
        classToTest.AddEdge(3,start,end2);
        classToTest.AddEdge(4,start,end3);
        classToTest.AddEdge(11,start,end4);

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

    @Test
    public void GetNeighborsLarge() {
        //this method returns a set of neighboring edges of the node that is passed in

        AdjacencyListGraph classToTest = new AdjacencyListGraph();
        GraphNode start = new GraphNode(1);
        GraphNode end1 = new GraphNode(2);
        GraphNode end2 = new GraphNode(2);
        GraphNode end3 = new GraphNode(2);
        GraphNode end4 = new GraphNode(2);
        GraphNode end5 = new GraphNode(12);


        Edge edge1 = new Edge(1,start,end1);
        Edge edge2 = new Edge(3,start,end2);
        Edge edge3 = new Edge(4,start,end3);
        Edge edge4 = new Edge(11,start,end4);
        Edge edge5 = new Edge(12,start,end5);

        //addEdge to node
        classToTest.AddEdge(1,start,end1);
        classToTest.AddEdge(3,start,end2);
        classToTest.AddEdge(4,start,end3);
        classToTest.AddEdge(11,start,end4);
        classToTest.AddEdge(12,start,end5);

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
    public void sizeSmall(){
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

    @Test
    public void sizeMedium(){
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

        //create node
        //add to adjacency list
        GraphNode n4 = new GraphNode(6);
        classToTest.addNode(n4);

        int actual = classToTest.size();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void sizeLarge(){
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

        //create node
        //add to adjacency list
        GraphNode n4 = new GraphNode(6);
        classToTest.addNode(n4);

        //create node
        //add to adjacency list
        GraphNode n5 = new GraphNode(6);
        classToTest.addNode(n5);

        int actual = classToTest.size();
        int expected = 5;
        assertEquals(expected,actual);
    }
}