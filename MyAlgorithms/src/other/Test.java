package other;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Test{
	PriorityQueue<node> heap = new PriorityQueue<>(new Comparator<node>() {

		@Override
		public int compare(node o1, node o2) {
			// TODO Auto-generated method stub
			return o1.time - o2.time;
		}
	});
	HashMap<Integer,Integer> map = new HashMap<>();
	int size;
	public int get(int key) {return 1;};
	public void put(int key,int value) {
		if(!map.containsKey(key)) {
		
		}
	}
}

class node  {	  
	int key;
	int time;
	node (int key ,int time){
		this.key = key;
		this.time = time;
	}
}
