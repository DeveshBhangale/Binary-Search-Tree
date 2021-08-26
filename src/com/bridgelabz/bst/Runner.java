package com.bridgelabz.bst;

public class Runner {
	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree= new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(55);
		
		
		int size = myBinaryTree.getSize();
		System.out.println(size);
		myBinaryTree.print();
		myBinaryTree.searchNodeInTree(12);
		myBinaryTree.searchNodeInTree(56);
	}
}
