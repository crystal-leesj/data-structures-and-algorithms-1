# Stacks and Queues
<!-- Short summary or background information -->

What is a Stack:
A stack is a data structure that consists of Nodes.
Each Node references the next node in the stack, but does not reference it’s previous

Stacks follow these concepts:
FILO concept: First In Last Out. This means that the first item in the stack, will be the last item out.
LIFO concept: Last In First Out This means that the last item in the stack, will be the first item out.

What is a Queue
Common terminology for a queue is:

Enqueue - Nodes or items that are added to the queue.
Dequeue - Nodes or items that are removed from the queue.
Front - This is the front/first node of the queue.
Rear - This is the rear/last node of the queue.
Peek - When you Peek you will view the Top node in the stack. If the stack is empty,
and you don’t Peek, you will receive a NullReferenceException

Queues follow these concepts:
FIFO - First In First Out - This means that the first item in the queue will be the first item out of the queue.
LILO - Last In Last Out - This means that the last item in the queue will be the last item out of the queue.

## Challenge
<!-- Description of the challenge -->
The challenge given was to create:
 1.A node class that has properties for the value stored in the Node, and a pointer to the next node
 2.A stack class that has a top property. It creates an empty Stack when instantiated. It contains method that can push,
 pop and peek at a given stack.
 3.A stack class that has a front property. It creates an empty Queue when instantiated. It contains method that can enqueue,
 dequeue and peek at a given queue.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach that I took was to initially draw out the problem domain. The Big O for space/time: O(1)

## API
<!-- Description of each method publicly available to your Stack and Queue-->
STACK CLASS:
1. Method called push  which takes any value as an argument and adds a new node with that value to the top
of the stack with an O(1) Time performance.
2. Method called pop that does not take any argument, removes the node from the top of the stack, and returns the node.
3. Method called peek that does not take an argument and returns the node located on the top of the stack.

QUEUE CLASS:
1.Method called enqueue which takes any value as an argument and adds a new node with that value to the back of the
queue with an O(1) Time performance.
2. Method called dequeue that does not take any argument, removes the node from the front of the queue, and returns
the node.
3. Method called peek that does not take an argument and returns the node located in the front of the stack.



