# Graphs
<!-- Short summary or background information -->
Graph is a data structure that consists of following two components:
1. A finite set of vertices also called as nodes.
2. A finite set of ordered pair of the form (u, v) called as edge. The pair is ordered because (u, v) is not same as (v, u) in case of a directed graph(di-graph). The pair of the form (u, v) indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.

 Graphs are used to represent many real-life applications: Graphs are used to represent networks. The networks may include paths in a city or telephone network or circuit network. Graphs are also used in social networks like linkedIn, Facebook. For example, in Facebook, each person is represented with a vertex(or node). Each node is a structure and contains information like person id, name, gender and locale. See this for more applications of graph.

source: https://www.geeksforgeeks.org/graph-and-its-representations/

## Challenge
<!-- Description of the challenge -->
### Features:
###### Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. AddNode() - Adds a new node to the graph - Takes in the value of that node - Returns the added node

2. AddEdge() - Adds a new edge between two nodes in the graph - Include the ability to have a “weight” - Takes in the two nodes to be connected by the edge - Both nodes should already be in the Graph

3. GetNodes():
   * Returns all of the nodes in the graph as a collection (set, list, or similar)
4. GetNeighbors():
   * Returns a collection of nodes connected to the given node
   * Takes in a given node
   * Include the weight of the connection in the returned collection

5. Size():
   * Returns the total number of nodes in the graph
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I took what I would consider almost an error driven approach.I started coding the methods and then adding the different variables to my classes as I needed them. I also drew a picture to understand the difference between bi-directional/undirected vs directed.

Space/Time: O(n)
## API
<!-- Description of each method publicly available in your Graph -->
1. AddNode() - Adds a new node to the graph - Takes in the value of that node - Returns the added node

2. AddEdge() - Adds a new edge between two nodes in the graph - Include the ability to have a “weight” - Takes in the two nodes to be connected by the edge - Both nodes should already be in the Graph

3. GetNodes():
   * Returns all of the nodes in the graph as a collection (set, list, or similar)
4. GetNeighbors():
   * Returns a collection of nodes connected to the given node
   * Takes in a given node
   * Include the weight of the connection in the returned collection

5. Size():
   * Returns the total number of nodes in the graph