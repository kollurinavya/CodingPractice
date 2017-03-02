package TreenGraph;
import java.io.*;
import java.util.*;
public class BalancedBinaryTree {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Node head = null;
		createBinary(a,0,a.length-1);

	}
	
	public static Node createBinary(int[] a,int l,int u){
		if(l<=u){
			int m = (l+u)/2;
			Node head = new Node(a[m]);
			head.left = createBinary(a,l,m-1);
			head.right = createBinary(a,m+1,u);
			return head;
		}
		return null;
	
	}

}

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
