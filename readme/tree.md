# Trees
<!-- Short summary or background information -->
There are two different types of trees that this lab uses:

1.Binary Trees

2.Binary Search Trees

# Common Terminology
Node - a node is the individual item/data that make up the data structure.

Root - The root is the first/top Node in a tree

Left Child - The node that is positioned to the left of the root

Right Child - The node that is positioned to the right of the root

# Traversals
There are two categories of traversals when it comes to trees:

    1. Depth First
    2. Breadth First
Depth First
Depth first is a traversal that traverses the depth (height) of the tree.

The different traversals determine at which point the Root is looked at.
Here are the three different depth first traversals broken down:

Preorder
Root, Left, Right

Inorder
Left, Root, Right

Postorder
Left, Right, Root


## Challenge
<!-- Description of the challenge -->
1. Create a Node class that has properties for the value stored in the node, the left child node, and the right child node

2. Create a BinaryTree class
  Define a method for each of the depth first traversals which takes in a root node returns an array of the nodes:
    1. preOrder,
    2. InOrder
    3. postOrder
3. Create a BinarySearchTree class
    1. Define a method named add that adds a new node in the correct location in the binary search tree.
    2. Define a method named search that brings in a value of node, and returns the node with the desired value.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 I started with a picture for each method drawing out the functionality and return value(node or int).
 Big O space:O(n)
 Big O time: O(log)

## BinaryTree Class:
1. Methods called preOrder, inOrder, and postOrder which takes in a root node, and returns an array of the nodes

2. Print method that return a list of node value as a string.

## BinarySearch Class:
1. method named add that adds a new node in the correct location in the binary search tree
2. method named search that brings in a value of node, and returns the node with the desired value.