package TreenGraph;

public class CheckBalance {

	public static void main(String[] args) {
		TNode head = new TNode(1);
		head.left = new TNode(2);
		head.right = new TNode(3);
		head.left.left = new TNode(4);
		head.left.right = new TNode(5);
		System.out.println(findBal(head));

	}
	
	public static int findBal(TNode head){
		if(head == null){
			return 0;
		}
		System.out.println(maxDepth(head));
		System.out.println(minDepth(head));
		return (maxDepth(head) - minDepth(head));
	}
	
	public static int maxDepth(TNode head){
		if(head!= null){
			return 1+Math.max(maxDepth(head.left), maxDepth(head.right));
		}else{
			return 0;
		}
	}
	public static int minDepth(TNode head){
		if(head!= null){
			return 1+Math.min(minDepth(head.left), minDepth(head.right));
		}else{
			return 0;
		}
	}

}


class TNode{
	TNode left,right;
	int data;
	TNode(int data){
		this.data = data;
		this.left = null;
		this.right= null;
	}
}