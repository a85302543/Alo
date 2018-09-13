package sort;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Point[] points = new Point[4];
		points[0] = new Point(3,1);
		points[1] = new Point(2,2);
		points[2] = new Point(5,3);
		points[3] = new Point(1,4);
		findMinPath(points,new Point(0,0),0,0);
		System.out.println(min);
		min = Integer.MAX_VALUE;
		
	}
	public static void findMinPath(Point[] points,Point point,int sum,int count) {
		for (int i = 0;i < points.length;i++) {
			if (!points[i].used) {
				sum+=pathLength(points[i], point);
				count++;
				points[i].used = true;
				if (count == points.length) {
					int result = sum +  pathLength(points[i],new Point(0,0));
					min = Math.min(min, result);
				}
				findMinPath(points,points[i],sum,count);
				sum-=pathLength(points[i], point);
				count--;
				points[i].used = false;
			}
		}
	}

	public static int pathLength(Point start,Point end) {
		  return Math.abs(start.x - end.x) + Math.abs(start.y - end.y);
	}
}
class Point{
	int x;
	int y;
	boolean used  = false;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
