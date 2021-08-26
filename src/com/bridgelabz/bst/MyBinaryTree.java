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
			getTreeNodes(root.left);
			System.out.println(root.key + " ");
			getTreeNodes(root.right);
		}
	}
	
	
	

}
