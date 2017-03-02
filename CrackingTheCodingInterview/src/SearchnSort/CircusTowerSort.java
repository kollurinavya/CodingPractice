package SearchnSort;
import java.io.*;
import java.util.*;
public class CircusTowerSort {

	public static void main(String[] args) {
	    ArrayList<HtWt> hw = new ArrayList<HtWt>();
	    hw.add(new HtWt(60, 100));
	    hw.add(new HtWt(56, 90));
	    hw.add(new HtWt(70, 150));
	    hw.add(new HtWt(75, 190));
	    hw.add(new HtWt(60, 95));
	    hw.add(new HtWt(68, 110));
	    Collections.sort(hw, new sortHtWt());
	    for(HtWt h:hw){
	    	System.out.println(h.ht+" "+h.wt);
	    }
	    

	}

}
class HtWt{
	int ht;
	int wt;
	HtWt(int ht,int wt){
		this.ht = ht;
		this.wt= wt;
	}
}
class sortHtWt implements Comparator<HtWt>{
     //HtWt hw1;
	
	@Override
	public int compare(HtWt h1,HtWt h2) {
		if(h1.ht >h2.ht){
			return 1;
		}else if (h1.ht <h2.ht){
			return -1;
		}else{
			if(h1.wt > h2.wt){
				return 1;
			}else if(h1.wt < h2.wt){
				return -1;
			}else{
				return 0;
			}
		}
	}
	
}
