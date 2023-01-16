package com.selister.sortalgorithms.stacks;

public class LinkedListMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(billEnd);

        stack.printStack();

        System.out.println("\nPeek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("\nPeek: " + stack.peek());
    }
}
