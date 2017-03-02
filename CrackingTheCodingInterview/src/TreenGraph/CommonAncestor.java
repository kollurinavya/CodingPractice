package TreenGraph;

public class CommonAncestor {

	public static void main(String[] args) {
		BNode head = new BNode(1);
		head.left = new BNode(2);
		head.right = new BNode(3);
		head.left.left = new BNode(4);
		head.left.right = new BNode(5);
		int p = 4;
		int q = 5;
		BNode ans =commonAncestor(head,p,q);
		System.out.println(ans.data);

	}
	public static int foundNodes(BNode head ,int p,int q){
		int ret = 0;
		if(head == null){
			return ret;
		}
		if(head.data == p || head.data == q){
			ret = 1;
		}
		ret +=foundNodes(head.left,p,q);
		if(ret == 2){
			return ret;
		}
		return ret + foundNodes(head.right,p,q);
	}
	
	
	
	public static BNode commonAncestor(BNode head,int p,int q){
		if(p==q && (head.left.data == p || head.right.data== q)) return head;
		
		int ret = foundNodes(head.left,p,q);
		if(ret == 2){
			if(head.left.data == p || head.left.data == q){
				return head;
			}else{
				return commonAncestor(head.left,p,q);
			}
		}else if(ret == 1){
			if(head.data == p) return head;
 			else if(head.data ==q)return head;
		}
		
		int retright = foundNodes(head.right,p,q);
	      if(retright ==2){
			if(head.right.data ==p || head.right.data == q){
				return head;
			}else{
				return commonAncestor(head.right,p,q);
			}
		}else if(retright == 1){
			if(head.data == p) return head;
			if(head.data == q) return head;
		}
		if(ret == 1 && retright ==1){
			return head;
		}
		return null;
	}	
}

class BNode{
	int data;
	BNode left,right;
	BNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}