package LinkedList;
import java.io.*;
import java.util.*;
public class ArrayQueue {

	public static void main(String[] args) {
		Queue q= new Queue(3);
		
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.dequeue());
		//System.out.println(q.size);
		q.enqueue(6);
		System.out.println(q.dequeue());
	//	System.out.println(q.size);
		System.out.println(q.dequeue());
		//System.out.println(q.size);
		System.out.println(q.dequeue());
	}

}
 
class Queue{
	int front,rear;
	int size;
	int[] arr;
	public Queue(int len){
		arr = new int[len];
		front=0;
		rear =-1;
		size =0;
	}
	public void enqueue(int n){
		if(size == arr.length){
			System.out.println("queue is full");
		}
		else{
			++rear;
			if(rear==arr.length){
				rear = 0;
				arr[rear] = n;
				size++;
			}else{
				arr[rear]=n;
				size++;
			}
		}
	}
	public int dequeue(){
		if(size==0){
			System.out.println("queue is empty");
			return -1;
		}
		//System.out.println("front "+front);
		int n = arr[front];
		if(front==arr.length-1){
			front =0;
		}else{
			++front;
		}
		--size;

		return n;
	}
}
