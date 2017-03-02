import java.io.*;
import java.util.*;

 class GNode{
	int id;
	LinkedList<GNode> adjacent;
	boolean visited;
	GNode(int id){
		this.id = id;
		this.adjacent= new LinkedList<GNode>();
	}
}
public class FriendRequest {
	
	static HashMap<Integer,GNode> graph = new HashMap<Integer,GNode>();	
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("enter number of nodes");
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				GNode gnode = new GNode(i);
				graph.put(i,gnode);
			}
			System.out.println("enter the number of edges");
			int edges = in.nextInt();
			System.out.println("enter the edges");
			for(int i=0;i<edges;i++){
				int node1 = in.nextInt();
				int node2 = in.nextInt();
				GNode n1 = graph.get(node1);
				GNode n2 = graph.get(node2);
				addEdge(n1,n2);
			}
			System.out.println("enter the node for suggestions");
			int req = in.nextInt();
			//GNode root = graph.get(0);
		//	GNode node= dfsSearch(root,req);
			GNode node = graph.get(req);
			if(node!= null){
				/*LinkedList<GNode> adj = node.adjacent;
				for(GNode i:adj){
					System.out.println(i.id);
				}*/
				getSuggestions(node);
			}
		}
		public static void getSuggestions(GNode n){
			LinkedList<GNode> adj = n.adjacent;
			HashSet<Integer> ans = new HashSet<Integer>();
			for(GNode i:adj){
				LinkedList<GNode> temp = i.adjacent;
				for(GNode n1:temp){
					if(!adj.contains(n1)&& n1.id != n.id ){
						ans.add(n1.id);
					}
				}
				
			}
			for(int i:ans){
				System.out.println(i);
			}
		}
		
		 public static void addEdge(GNode n1,GNode n2){
			 LinkedList<GNode> l1 = n1.adjacent;
			// if(!l1.contains(n2)){
				 l1.add(n2);
			 //}
			 
			 LinkedList<GNode> l2 = n2.adjacent;
			 //if(!l2.contains(n1)){
				 l2.add(n1); 
			 //}
			 
		 }
		 
		 public static GNode dfsSearch(GNode root,int id){
			 if(root.id == id){
				 return root;
			 }
			 LinkedList<GNode> l = root.adjacent;
			 for(GNode n:l){
				 if(!n.visited){
					 n.visited= true;
					 if(n.id == id){
						 return n;
					 }
					return dfsSearch(n,id);
				 }			 
			 }
			 return null;
		 }
		 
		 
}
