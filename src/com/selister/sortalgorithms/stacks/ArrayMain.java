package com.selister.sortalgorithms.stacks;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 456));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();

        System.out.println("\nPeek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("\nPeek: " + stack.peek());
    }
}
