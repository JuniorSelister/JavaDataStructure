package com.selister.sortalgorithms.queue.circularqueue;

public class CircularArrayQueueMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        CircularArrayQueue queue = new CircularArrayQueue(5);

        // The commented codes below will not hit the breakpoint, in case marked

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.remove();
//        queue.add(marySmith);
//        queue.remove();
//        queue.add(mikeWilson);
//        queue.remove();
//        queue.add(billEnd);
//        queue.remove();
//        queue.add(janeJones);
//
//        queue.printQueue();

        // In case the breakpoint be set, the debugger will show you
        // how the circular queue implementation will handle the code below

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

    }
}
