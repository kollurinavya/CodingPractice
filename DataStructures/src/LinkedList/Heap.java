package LinkedList;
import java.io.*;
import java.util.*;

public class Heap {
		public static void main(String[] arg){
			int[] arr = {4,10,3,5,1};
			sort(arr,arr.length-1);
			printArray(arr);
		}
		
		public static void printArray(int[] arr){
			for(int i =0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		public static void sort(int[] arr,int l){
		 if(l<= 0){
			 return;
		 }
				heapify(arr,l);
				printArray(arr);
				swap(arr,0,l);
				printArray(arr);
				sort(arr,l-1);
			
		}
		
		public static void heapify(int[] arr,int  n){
		//	int x = (n%2==0)? (n/2-1) : n/2;
			for(int i=n;i> 0 ;i--){
				if(i%2 == 0){
					if(arr[(i/2)-1]<arr[i]){
						swap(arr,(i/2)-1,i);
					}
				}else{
					if(arr[(i-1)/2] <arr[i]){
						swap(arr,(i-1)/2,i);
					}
				}
			}
		}
		
		public static void swap(int[] arr,int x,int y){
			int temp = arr[x];
			arr[x]=arr[y];
			arr[y] = temp;
		}

}


