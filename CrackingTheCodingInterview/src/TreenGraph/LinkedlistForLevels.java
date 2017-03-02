package TreenGraph;
import java.util.*;
public class LinkedlistForLevels {

	public static void main(String[] args) {
	
			GNode head = new GNode(1);
			head.left = new GNode(2);
			head.right = new GNode(3);
			head.left.left = new GNode(4);
			head.left.right = new GNode(5);
			ArrayList<LinkedList<GNode>> ans = new ArrayList<LinkedList<GNode>>();
			LinkedList<GNode> cur = new LinkedList<GNode>();
			cur.add(head);
			ans.add(cur);
			while(cur != null){
				LinkedList<GNode> next= new LinkedList<GNode>();
				for(int i=0;i<cur.size();i++){
					GNode node = cur.get(0);
					if(node != null){
						if(node.left != null){
							next.add(node.left);
						}
						if(node.right != null){
							next.add(node.right);
						}
					}
				}
				if(next.size() >0){
					ans.add(next);
				}
				
				cur = next;
			}
			
			
	}

}

	class GNode{
		GNode left,right;
		int data;
		GNode(int data){
			this.data = data;
			this.left = null;
			this.right= null;
		}
	}