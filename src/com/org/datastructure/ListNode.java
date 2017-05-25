package com.org.datastructure;

public class ListNode {
	private int data;
	private ListNode nextNode;
	public ListNode(int data) {
		this.data = data;
	}
	public ListNode() {
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return "ListNode [getData()=" + getData() + "]";
	}
	
	

}
