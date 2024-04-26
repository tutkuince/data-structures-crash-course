package io.tince._06doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        System.out.println("Removed Node Value is: " + doublyLinkedList.removeLast().value);
        doublyLinkedList.prepend(9);

        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();

        doublyLinkedList.printList();
    }
}
