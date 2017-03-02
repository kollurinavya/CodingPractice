
public class DeleteNodeFromBinTree {
	 Node root;
	 class Node{
			int data;
			Node left,right;
			public Node(int data){
				this.data = data;
				this.left= this.right= null;
			}
		}
	 
	public static void main(String[] args) {
		DeleteNodeFromBinTree bin = new DeleteNodeFromBinTree();
		bin.insert(50);
		bin.insert(30);
		bin.insert(40);
		bin.insert(70);
		bin.insert(60);
		bin.insert(80);
		
		bin.delete(50);
		//

	}
	public void delete(int val){
		deleteNode(root,val);
		System.out.println(root.data);
		System.out.println(root.right.right.data);
	}
	public void deleteNode(Node root,int val){
		
		Node cur = root;
		//System.out.println(cur.data);
		Node parent = null;
		
		while( cur != null  ){
			if(cur.data == val){
				break;
			}
			parent = cur;
			
			if(val<cur.data){
				cur =  cur.left;
			}else{
				cur = cur.right;
			}
		}
		
		if(cur == null){
			System.out.println("value not found");
			return ;
		}
	//System.out.println(parent.data);
		if(cur.left == null && cur.right == null){
			if(parent.left == cur){
				parent.left = null;
			}else{
			
				//cur = null;
				parent.right = null;
			}
			return ;
		}
		if(cur.left != null && cur.right == null){
			if(parent.left == cur){
				parent.left = cur.left;
			}else{
				parent.right = cur.left;
			}
			return;
		}
		
		if(cur.left == null && cur.right != null){
			if(parent.left == cur){
				parent.left = cur.right;
			}else{
				parent.right = cur.right;
			}
			return;
		}
		
		if(cur.left!= null && cur.right!= null){
			Node min = cur.right;
			while(true){
				if(min.left != null){
					min = min.left;
				}else{
					break;
				}
			}
			System.out.println("min value"+min.data);
			int minVal = min.data;
			delete(min.data);
			cur.data = min.data;
		}
	}
	public void insert(int val){
		Node n = new Node(val);
		if(root== null){
			root = n;
			return;
		}
		Node cur = root;
		Node parent = root;
		 while(cur != null){
			 parent = cur;
			 if(val < cur.data ){
				 cur = cur.left;
			 }else{
				 cur = cur.right;
			 }
		 }
		 if(val <parent.data){
			 cur = n;
			 parent.left = cur;
		 }else{
			 cur = n;
			 parent.right = cur;
		 }
	}

}


