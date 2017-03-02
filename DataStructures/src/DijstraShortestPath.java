import java.io.*;
import java.util.*;

class Graph{
	static class  Edge{
		int vertex;
		int cost;
		Edge(int vertex,int cost){
			this.vertex= vertex;
			this.cost = cost;
		}
		int getVertex(){
			return this.vertex;
		}
		int getCost(){
			return this.cost;
		}
	}
	public void addVertex(int v){
		if(graph.get(v)== null){
			ArrayList<Edge> list = new ArrayList<Edge>();
			graph.put(v, list);
		}
	}
	public void addEdge(int v1,int v2,int cost){
		Edge e = new Edge(v2,cost);
		 graph.get(v1).add(e);
		
	}

	 HashMap<Integer,ArrayList<Edge>> graph = new HashMap<Integer,ArrayList<Edge>>();
	 public void shortestPath(int src,int dest){
		 int[] parent = new int[4];
		
		 int[] cost = new int[4];
		 for(int i=0;i<4;i++){
			 cost[i]=0;
		 }
		 int cur = src;
		 boolean found=false;
		 while(true){
			 if(found){
				 System.out.println(found);
				 break;
			 }
			 
			 ArrayList<Edge> listedg = graph.get(cur);
			 int minCost = listedg.get(0).getCost();
			//int nextVer = listedg.get(0).getVertex();
			 for(Edge e:listedg){	 
					 parent[e.getVertex()]= cur;
					 cost[e.getVertex()] = cost[cur]+e.getCost();
					 if(e.getVertex()==dest){
						 System.out.println("found");
						 found = true;
						 break;
					 }
					 if(e.getCost()<minCost){
						 minCost = e.getCost();
						 cur = e.getVertex();
					 } 
				 
			 }
		 }
		 
	 }
}
public class DijstraShortestPath {

	public static void main(String[] args) {
		Graph g = new Graph();
		Scanner in = new Scanner(System.in);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		  g.addEdge(0, 1, 2);
		    g.addEdge(0, 2, 2);
		    g.addEdge(1, 2, 1);
		    g.addEdge(1, 3, 1);
		    g.addEdge(2, 0, 1);
		    g.addEdge(2, 3, 2);
		    g.addEdge(3, 3, 2);
		    g.shortestPath(0,3);

	}

}
