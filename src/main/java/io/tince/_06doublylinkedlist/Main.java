package io.tince._06doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        // System.out.println("Removed Last Node Value is: " + doublyLinkedList.removeLast().value);
        doublyLinkedList.prepend(9);
        // System.out.println("Removed First Node Value is: " + doublyLinkedList.removeFirst().value);


//        doublyLinkedList.append(3);
//        doublyLinkedList.append(5);
        doublyLinkedList.printList();
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        System.out.println(doublyLinkedList.get(3).value);
        System.out.println("Value of Index(1) is changed to 3? " + doublyLinkedList.set(1, 3));
        System.out.println("New Value is inserted to the Index(0)? " + doublyLinkedList.insert(1, 5));

        doublyLinkedList.printList();
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        System.out.println("Value of Index(3) is deleted? " + doublyLinkedList.remove(3).value);
        doublyLinkedList.printList();
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();

    }
}
