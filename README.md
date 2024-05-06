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
