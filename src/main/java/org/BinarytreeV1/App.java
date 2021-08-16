package org.BinarytreeV1;

public class App {
    public static void main(String[] args) {
        BinaryTreeV1 binaryTree=new BinaryTreeV1(5);
        binaryTree.addElement(3);
        binaryTree.addElement(5);
        binaryTree.addElement(10);
        binaryTree.addElement(14);
        binaryTree.addElement(45);
        System.out.println(binaryTree.findElement(10));

    }
}
