package com.selister.sortalgorithms.lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\n" + employeeList.get(1));
        System.out.println("Is empty? " + employeeList.isEmpty() + "\n");
        employeeList.set(1, new Employee("John", "Adams", 4568));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("Size: " + employeeList.size() + "\n");

        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\nRemoved the " + employeeList.get(2) + ", from position " + employeeList.indexOf(employeeList.get(2)) + " in the list.\n");

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
