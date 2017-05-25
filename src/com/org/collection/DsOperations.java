package com.org.collection;

import java.util.ArrayList;
import java.util.List;

import com.org.datastructure.ListNode;

public class DsOperations {
    private ListNode head;
    private ListNode tail;
    int element;
	static List lst=new ArrayList();



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DsOperations sl = new DsOperations();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
     //   System.out.println(sl);
        System.out.println(lst);
        System.out.println("length of LinkedList: "+sl.getLength());
	}
	
	public  int getLength(){
		int length=0;
		ListNode currentNode=head;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.getNextNode();
		}
		
		return length;
		
		
	}

	public void add(int element){
	    
		ListNode nd = new ListNode();
	    nd.setData(element);
	    lst.add(element);
	    System.out.println("Adding: "+element);
	    /**
	     * check if the list is empty
	     */
	    if(head == null){
	        //since there is only one element, both head and
	        //tail points to the same object.
	        head = nd;
	        tail = nd;
	    } else {
	        //set current tail next link to new node
	        tail.setNextNode(nd);
	        //set tail as newly created node
	        tail = nd;
	    }

	    
}

	
	
	
	
}
