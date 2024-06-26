# Data Structures & Algorithms + Exercises
## Linked Lists
### LinkedList vs ArrayList
#### ArrayList
- An ArrayList is a dynamic array-based data structure in Java that can grow or shrink in size dynamically.
- It's part of the Java Collections Framework and allows you to store and manipulate a list of elements, providing methods for adding, removing, and accessing elements.
- Unlike traditional arrays, ArrayLists automatically handle resizing, making them more flexible for many programming tasks.
#### LinkedList
- A LinkedList is a data structure in which elements are connected through pointers or references.
- It consists of nodes, each containing data and a reference to the next node in the sequence.
- There are singly linked lists (each node points to the next) and doubly linked lists (nodes have references to both the next and previous nodes).
- LinkedLists are efficient for insertions and deletions in the middle but less efficient for random access.

The main differences between **ArrayList** and **LinkedList** in Java are:
- **_Internal Structure_**:
  - **ArrayList** uses an array to store elements.
  - **LinkedList** uses a doubly linked list structure with nodes containing data and references to the next and previous nodes.
- **_Access Time_**:
  - **ArrayList** provides faster random access time due to direct array indexing.
  - **LinkedList** is slower for random access but efficient for insertions and deletions in the middle.
- **_Insertions and Deletions_**:
  - **ArrayList** is less efficient for insertions and deletions in the middle because elements need to be shifted.
  - **LinkedList** excels in insertions and deletions at any position due to its structure.
- **_Memory Usage_**:
  - **ArrayList** may have slightly less memory overhead due to its simple array structure.
  - **LinkedList** has more memory overhead because of the additional node references.
- **_Iterating Through Elements_**:
  - **ArrayList** is faster when iterating sequentially through elements.
  - **LinkedList** is slower due to the need to follow node references.
- **_Implementation_**:
  - **ArrayList** is a more straightforward implementation.
  - **LinkedList** involves more complex pointer manipulation.
 
The choice between ArrayList and LinkedList depends on your specific use case. 
- If you need _fast random access and are not frequently inserting or removing elements in the middle_, **ArrayList** is a better choice.
- If you _require efficient insertions and deletions or are working with large datasets_, **LinkedList** may be more suitable.

## Stack
- **Stack** is a linear data structure that follows a particular order in which the operations are performed. The order may be **LIFO(Last In First Out)** or **FILO(First In Last Out)**.
- LIFO implies that the element that is inserted last, comes out first and FILO implies that the element that is inserted first, comes out last.

## Queue
- The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order
- It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, it follows the **FIFO** or the First-In-First-Out principle.

## Tree
- A **tree** is a kind of data structure that is used to represent the data in hierarchical form.
- It can be defined as a collection of objects or entities called as nodes that are linked together to simulate a hierarchy.
- **Tree** is a non-linear data structure as the data in a tree is not stored linearly or sequentially.

### Binary Search Tree
- In a **Binary Search Tree**, the value of left node must be smaller thatn the parent node, and the value of right node must be greater than the parent node.
- This rule is applied recursively to the left and right subtrees of the root.

### Binary Search Tree vs LinkedList
- An **insert** into a **Binary Search Tree** is typically **(log n)**
- **Appending** an item onto the end of a **Linked List** is **O(1)**
- **Binary Search Trees** use divide and conquer.
- Adding an item to **Binary Search Tree** is always log n ?
  - Omega (best case) and Theta (average case) are both (log n)
  - However, worst case is O(n) and Big O measures worst case.
  - The typically treat Binary Search Trees as O(log n) but technically they are O(n)
 
## Hash Table
- The **Hashtable** class implements a hash table, which maps keys to values.
- Any non-null object can be used as a key or as a value.
- To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the **hashCode** method and the **equals** method.
- In addition, the **Hashtable** class is synchronized, which can result in slower performance compared to other implementations of the **Map** interface.
- In general, it's recommended to use the Map interface or one of its implementations (such as HashMap or ConcurrentHashMap) instead of the Hashtable class.

### Hash Table Big O
- Both Insert and Lookup by key in a Hash Table is O(1)
- **Binary Search Trees** are sorted which makes them better at **searching** for all values that fall within a range.
- Looking up a value in a Hash Table is O(1)

## Graph
- Graph is a non-linear data structure consisting of vertices and edges.
- The vertices are sometimes also referred to as nodes and the edges are lines or arcs that connect any two nodes in the graph.
- Graph data structures are a powerful tool for representing and analyzing complex relationships between objects or entities.

### Components of a Graph:
- Vertices: Vertices are the fundamental units of the graph. Sometimes, vertices are also known as vertex or nodes.
  - Every node/vertex can be labeled or unlabeled.
- Edges: Edges are drawn or used to connect two nodes of the graph.
  - It can be ordered pair of nodes in a directed graph.
  - Edges can connect any two nodes in any possible way.
  - There are no rules.
  - Sometimes, edges are also known as arcs. Every edge can be labelled/unlabelled.
### Graph Big O
- Adding a Vertex in a Graph with an Adjacency List is O(1)
- Removing a vertex is O(n)
  - Finding the vertex is O(1). However, you can also have to remove all of the edges associated with the vertex you are removing.
 
## Heap
- A **Heap** is a complete binary tree data structure that satisfies the heap property:
  - for every node, the value of its children is less than or equal to its own value.
- Heaps are usually used to implement priority queues, where the smallest or largest element is always at the root of the tree
### Max Heap
- The root node contains the maximum value, and the values decrease as you moved down the tree
### Min Heam
- The root node contains the minimum value, and the values increase as you move down the tree.

## Tree Traversal 
- **Tree Traversal techniques** include various ways to visit all the nodes of the tree.
- Unlike linear data structures (Array, Linked List, Queues, Stacks, etc) which have only one logical way to traverse them, trees can be traversed in different ways.
### Breadth First Search
- Storing the frontier nodes in a queue creates the level-by-level pattern of a breadth-first search
- Child nodes are searched in the order they are added to the frontier.
- The nodes on the next level are always behind the nodes on the current level.
- Breadth-first search is known as a complete algorithm since no matter how deep the goal is in the tree it will always be located.
### Depth First Search 
- Frontier nodes stored in a stack create the deep dive of a depth-first search.
- Nodes added to the frontier early on can expect to remain in the stack while their sibling’s children (and their children, and so on) are searched.
- Depth-first search is not considered a complete algorithm since searching an infinite branch in a tree can go on forever. In this situation, an entire section of the tree would be left un-inspected.

## Basic Sorts
### Bubble Sort
- **Bubble Sort** is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
- This algorithm is not suitable for large data sets as its average and worst-case time complexityh is quite high.
#### In Bubble Sort Algorithm,
- traverse from left and compare adjacent elements and the higher on is placed at right side.
- In this way, the largest element is moved to the rightmost end at first.
- This process is then continued to find the second largest and place it and so on until the data is stored.
### Selection Sort
- **Selection Sort** is a simple and efficient sorting algoritm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.
#### In Selection Sort Algorithm,
- Go through the array to find the lowest value.
- Move the lowest value to the front of the unsorted part of the array.
- Go through the array again as many times as there are values in the array.
## Insertion Sort
- **Insertion Sort** is a simplke sorting algoritm that works by iteratively inserting each element of an unsorted list into its correct poistion in a sorted portion of the list.
- It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order in the sorted output.
#### In Insertion Sort Algoritm,
- We have to start with second element of the array as first element in the array is assumed to be sorted.
- Compare second element with the first element and check if the second element is smaller then swap them.
- Move to the third element and compare it with the second element, then the first element and swap as necessary to put it in the correct position among the first three elements.
- Continue this process, comparing each element with the ones before it and swapping as need to place it in the correct position among the sorted elements.
- Repeat until the entire array is sorted.

## Merge Sort
- **Merge Sort** is a algorithm that follows the **divide-and-conquer** approach
- It works by recursively dividing the input array into smaller subarrays and sorting those subarrays then mergining them back together to obtain the sorted array.
- In simple terms, we can say that the process of **merge sort** is to divide the array into two halves, sort each half, and then merge the sorted halves back together.  This process is repeated until the entire array is sorted.
### Merge Sort Big O
- (n log n)
