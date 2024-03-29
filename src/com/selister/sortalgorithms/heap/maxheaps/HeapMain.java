package com.selister.sortalgorithms.heap.maxheaps;

public class HeapMain {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
        heap.sort();

        System.out.println("\nHeap sort below");
        heap.printHeap();

        heap.delete(5);
        System.out.println("\n");
        heap.printHeap();

        System.out.println();
        System.out.println("Heap peek " + heap.peek());

    }
}
