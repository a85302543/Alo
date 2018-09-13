// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main1 {

	public static LinkedList findorder(PriorityQueue<Order> queue,long time ) {
		LinkedList<Long> list = new LinkedList<>();
		Order temp = queue.poll();
		while ( temp != null && temp.intime<=time ) {
			if(temp.outtime >= time) {
				list.add(temp.name);
			}
			temp = queue.poll();
		}
		return list;
	}
    public static void main(String[] args) {
    	PriorityQueue<Order> queue =new PriorityQueue<>(new Comparator<Order>() {
			@Override
			public int compare(Order o1, Order o2) {
				// TODO Auto-generated method stub
				return (int) (o1.intime - o2.intime);
			}});
    	
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        long time = Long.parseLong(in.nextLine());
        for (int i=0;i<num;i++) {
        	String s = in.nextLine();
        	String[] temp = s.split(" ");
        	queue.add(new Order(Long.parseLong(temp[0]),Long.parseLong(temp[1]),Long.parseLong(temp[2])));	
        }
        LinkedList<Long> list = findorder(queue,time);
        
        Object[] result = list.toArray();
        Arrays.sort(result);
        for (int i = 0;i<result.length;i++) {
        	System.out.println(result[i]);
        }
       
    }

	}
class Order{
	public long name;
	public long intime;
	public long outtime;
	Order(long name,long intime,long outtime){
		this.intime = intime;
		this.outtime = outtime;
		this.name = name;
	}
}
