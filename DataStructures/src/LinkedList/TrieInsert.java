package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
class TrieNode{
	TrieNode()
	{		
	}
	TrieNode(char c){
		this.c =c	; 
	}
	char c;
	HashMap<Character,TrieNode> m = new HashMap<Character,TrieNode>();
	boolean isleaf;
}

public class TrieInsert {
	TrieNode root;
    TrieInsert(){
    	this.root= new TrieNode();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dictionary ={"apple","ale"};
		TrieInsert t = new TrieInsert();
		for(String s:dictionary){
			t.insert(s);
		}

	}
    public  void insert(String word){
    	HashMap<Character, TrieNode> children= root.m;
    	TrieNode t;
    	for(int i=0;i<word.length();i++){
    		char c = word.charAt(i);
    		
    		if(children.containsKey(c)){
    			t = children.get(c);
    		}else{
    			t = new TrieNode(c);
    			children.put(c, t);
    		}
    		children = t.m;
    		if(i == word.length()-1){
    			t.isleaf= true;
    		}
    	}
     }
    
    public boolean search(String w){
    	HashMap<Character,TrieNode> child = root.m;
    	TrieNode t;
    	for(int i=0;i<w.length();i++){
    		char c = w.charAt(i);
    		if(i==w.length()-1){
    			if(child.containsKey(c)){
    				return true;
    			}else{
    				return false;
    			}
    		}
    		if(child.containsKey(c)){
    		      t= child.get(c);
    		      child = t.m;
    		}
    			return false;
    		
    	}
    	return false;
    }
    
}

