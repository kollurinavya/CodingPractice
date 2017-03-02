import java.io.*;
import java.util.*;
public class BinarySum {
	public static ArrayList<String> ans = new ArrayList<String>();
	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(3);
		root.right = new Node(5);
		root.left.left = new Node(2);
		root.left.right = new Node(5);
		root.left.right.left= new Node(7);
		root.left.right.right = new Node(4);
		root.right.right = new Node(4);
		int rootdata = root.data;
		findBinarySum(root,root.data+"");
		int sum=0;
		for(String i:ans){
			int temp = Integer.parseInt(i);
			sum +=temp; 
		}
		System.out.println(sum);

	}
	
	public static void findBinarySum(Node root,String prefix){
		if(root.left== null && root.right == null){
		     ans.add(prefix);
		}
		String temp = prefix;
		if(root.left != null){
			temp = temp+""+ root.left.data;
			findBinarySum(root.left,temp);
		}
		if(root.right != null){
			prefix = prefix+""+ root.right.data;
			findBinarySum(root.right,prefix);
		}
	}

}
 class Node{
	 int data;
	 Node left,right;
	
	public  Node(int data){
		 this.data = data;
		 this.left = null;
		 this.right = null;
	 }
 }