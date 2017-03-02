package LinkedList;
import java.io.*;
import java.util.*;
public class LastNthElement {

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next  = new Node(4);
		head.next.next.next = new Node(3);
		//findNthFromLast(head,1);
		System.out.println(head.next.next.data);
		deleteWithOutHead(head.next.next);
		System.out.println(head.next.next.data);

	}
	
	public static void findNthFromLast(Node head,int n){
		Node cur = head;
		Node runner = head;
		int i=0;
		while(i<n){
			runner = runner.next;
			i++;
		}
		while(runner.next != null){
			cur = cur.next;
			runner = runner.next;
		}
		System.out.println(cur.data);
	}
	 
	public static void deleteWithOutHead(Node n){
		Node nNode = n.next;
		while(nNode != null){
			n.data = nNode.data;
			n= nNode;
			nNode = nNode.next;
		}
	}

}


