package other;

public class Wuliuzuiduanlujing {
	public static int minPath(point [] arr) {
		boolean[] help = new boolean[arr.length];
		
		return 0;
		
	}
	public static int caculen(point a ,point b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}
	public static int dfs (point[] arr,boolean[] helper ,int level,point start,int min,int result) {
		if (arr.length == level) {
			result += caculen(start,new point(0,0));
			if (result < min) min = result;
			return min;
		}
		for (int i =0;i<arr.length;i++) {
			if (!helper[i]) {
				helper[i] = true;
				result += caculen(start,arr[i]);
				dfs(arr,helper,++level,arr[i],min,result);
			}
			result -= caculen(start,arr[i]);
			helper[i] = false;
		}
		return min;
	}

    public static void main(String[] args) {
    	point[] arr = {new point(2, 2), new point(2, 8),new point(4, 4),new point(7, 2)};
        System.out.println(dfs(arr,new boolean[arr.length],1,new point(0,0),0,0));
    }
}
class point{
	int x = 0;
	int y = 0;
	point (int x,int y){
		this.x = x;
		this.y = y;
		
	}
}
