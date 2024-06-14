package tnsDay13;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pQueue=new PriorityQueue<>();
		pQueue.add(10);
		pQueue.add(30);
		pQueue.add(20);
		pQueue.add(50);
		pQueue.add(80);
		pQueue.add(3);
		pQueue.add(300);
		pQueue.add(1);
		System.out.println(pQueue);
		while(!pQueue.isEmpty())
		{
			System.out.println(pQueue.remove());
		}
	}

}
