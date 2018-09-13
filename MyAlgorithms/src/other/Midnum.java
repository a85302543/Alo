package other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Midnum {
	public static int midNum (LinkedList<Integer> list) {
		PriorityQueue<Integer> minheap = new PriorityQueue<>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return (int)o1 - (int)o2;
			}});
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return (int)o2 - (int)o1;
			}});
		while (list.size() != 0) {
			int temp = list.removeFirst();
			if (maxheap.size() == 0 || temp <maxheap.peek()) {
				maxheap.add(temp);
			}else {minheap.add(temp);};
			if (maxheap.size() > minheap.size() + 1) {
				minheap.add(maxheap.poll());
			}else if (minheap.size() > maxheap.size() + 1) {
				maxheap.add(minheap.poll());
			}
		}
		if (minheap.size() == maxheap.size()) return (minheap.poll() + maxheap.poll()) / 2;
		if (minheap.size() > maxheap.size()) return minheap.poll();
		return maxheap.poll();
		
		
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(7);
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(12);
		list.add(0);
		System.out.println(midNum(list));
	}
}
