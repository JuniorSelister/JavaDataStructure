package com.selister.sortalgorithms.lists.doublylinkedlist;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("Size: " + list.getSize());
        System.out.println("Is empty? " + list.isEmpty() + "\n");

        list.printList();


//        System.out.println("Is empty? " + list.isEmpty() + "\n");

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);

        System.out.println("\nSize: " + list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println("\nSize: " + list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println("\nSize: " + list.getSize());
        list.printList();

    }
}
