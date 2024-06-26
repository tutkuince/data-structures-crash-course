package io.tince._05linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(6);
        myLinkedList.prepend(2);
        myLinkedList.set(0, 0);
        myLinkedList.insert(1, 8);
        myLinkedList.remove(2);
        // myLinkedList.removeFirst();
        // myLinkedList.removeFirst();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        System.out.println("-------------------");
        myLinkedList.reverse();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        // (2) Items - Returns 2 Node
        // System.out.println(myLinkedList.removeLast().value);
        // (1) Items - Returns 1 Node
        // System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns 1 Node
        // System.out.println(myLinkedList.removeLast());
    }
}
