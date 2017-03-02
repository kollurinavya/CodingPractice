package LinkedList;
import java.io.*;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next  = new Node(4);
		head.next.next.next = new Node(3);
		removeDuplicate(head);
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		//System.out.println(head.next.next.next.data);
		
		
	}
	public static void removeDuplicate(Node head){
		   Node prev = head;
		   Node cur = head.next;
		   Node parent = null;
		   while(cur != null){
			   while(prev != cur){
				  
				   if(cur.data == prev.data){
					   if(prev == head){
						   head = head.next;
					   }else{
						   if(prev.next != null){
							   parent.next = prev.next;   
						   }
						   
					   }
				   }
				   parent = prev;
				   prev = prev.next;
			   }
			   prev = head;
			   cur = cur.next;
		   }
	}
	

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
