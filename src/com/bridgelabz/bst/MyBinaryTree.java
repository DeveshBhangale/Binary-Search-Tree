package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> c,K key){
		if(c == null) {
			return new MyBinaryNode<>(key);
		}
		int compareRes = key.compareTo(c.key);
		if(compareRes == 0) return c;
		if(compareRes<0) {
			c.left = addRecursively(c.left,key);
		}else {
			c.right = addRecursively(c.right,key);
		}
		return c;
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0:1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}
	
	public void print() {
		this.getTreeNodes(root);
	}

	private void getTreeNodes(MyBinaryNode<K> root) {
		if(root == null)
			return;
		else {
			System.out.println(root.key);
			getTreeNodes(root.left);
			getTreeNodes(root.right);
		}
	}
	
	public void searchNodeInTree(K key) {
		if (this.search(root,key)) {
			System.out.println(key + " is present in Binary Search Tree");
		}
		else {
			System.out.println(key + " is not present in Binary Search Tree");
		}
	}
	
	private boolean search(MyBinaryNode<K> root,K key) {
		if (root == null) 
			return false;
		int compareKey = key.compareTo(root.key);
		if (compareKey == 0) 
			return true;
		if (compareKey < 0)
			return search(root.left,key);
		else 
			return search(root.right,key);
	}
	
	

}
