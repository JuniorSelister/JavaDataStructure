package com.selister.sortalgorithms.binarytree;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
//        intTree.insert(25);
//        intTree.insert(20);
//        intTree.insert(15);
//        intTree.insert(27);
//        intTree.insert(30);
//        intTree.insert(29);
//        intTree.insert(26);
//        intTree.insert(22);
//        intTree.insert(32);
//        intTree.insert(17);


        intTree.insert(9);
        intTree.insert(8);
        intTree.insert(7);
        intTree.insert(3);
        intTree.insert(6);
        intTree.insert(5);
        intTree.insert(2);
        intTree.insert(4);

        intTree.traverseInOrder();
        System.out.println();
        intTree.traversePreOrder();

        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(888));

        System.out.println();

        System.out.println(intTree.min());
        System.out.println(intTree.max());


    }
}
