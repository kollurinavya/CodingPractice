import java.io.*;
import java.util.*;
public class TruckQueue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Vertex[] v = new Vertex[n];
		for(int i=0;i<n;i++){
			int x = in.nextInt();
			int y= in.nextInt();
			int ind = i;
			v[i]= new Vertex(x,y,ind);
		}
		int x =findStart(v);
		System.out.println(x);
	}
  public static int findStart(Vertex[] v){
	  Queue<Vertex> q = new LinkedList<Vertex>();
	  
	  int currPetrol=0;
	  if(currPetrol<0){
		  q.add(v[0]);
	  }
	  int i=0;
	
	  while(q.size()<=v.length){
		  currPetrol = currPetrol + v[i].petrol-v[i].distance;
		  if(currPetrol>0){
			  if(v[i].flag!=1){
				  v[i].flag=1;
				  q.add(v[i]);  
			  }else{
				  break;
			  }
			  
		  }else{
			  if(!q.isEmpty()){
				  Vertex t = q.peek();
				  
				  q.poll();
				//  if(currPetrol>0){
					  currPetrol = currPetrol -(t.petrol-t.distance); 
				 // }
				  
			  }else{
				  return -1;
			  }
		  }
		  
		  if(i==v.length-1){
			  i =0;
		  }else{
			  i++;
		  }
	  }
	  return q.peek().index;
  }
	
}

class Vertex{
	int petrol;
	int distance;
	int index;
	int flag;
	public Vertex(int pretrol,int distance,int index){
		this.petrol=petrol;
		this.distance=distance;
		this.index= index;
		this.flag=0;
	}
}
