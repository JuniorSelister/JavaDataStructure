package com.selister.sortalgorithms.lists.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("Size: " + list.getSize());
        System.out.println("Is empty? " + list.isEmpty() + "\n");

        list.printList();

        list.removeFromFront();

        System.out.println("\nSize: " + list.getSize());
        System.out.println("Is empty? " + list.isEmpty() + "\n");

        list.printList();
    }
}
