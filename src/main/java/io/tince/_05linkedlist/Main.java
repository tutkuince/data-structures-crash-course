package io.tince._05linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(6);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        System.out.println("-------------------");
        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Items - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns 1 Node
        System.out.println(myLinkedList.removeLast());
    }
}
