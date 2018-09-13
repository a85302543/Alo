package other;

public class MinPath {
	static int min  = Integer.MAX_VALUE;
	public static int minPath(Node[] arr) {
		boolean[] help = new boolean[arr.length];
		
		return 0;
		
	}
	public static int caculen(Node a ,Node b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}
	public static int dfs (Node[] arr,boolean[] helper ,int level,Node start,int result) {
		if (arr.length == level) {
			result += caculen(start,new Node(0,0));
			if (result < min) min = result;
			return min;
		}
		for (int i =0;i<arr.length;i++) {
			if (!helper[i]) {
				result += caculen(start,arr[i]);
				if (result <min) {
					helper[i] = true;
					dfs(arr,helper,level+1,arr[i],result);
				}
				result -= caculen(start,arr[i]);
				helper[i] = false;
			}
			
		}
		return min;
	}

    public static void main(String[] args) {
        Node[] arr = {new Node(2, 2), new Node(2, 8),new Node(4, 4),new Node(7, 2)};
        System.out.println(dfs(arr,new boolean[arr.length],0,new Node(0,0),0));
    }
    static class Node{
    	int x = 0;
    	int y = 0;
    	Node (int x,int y){
    		this.x = x;
    		this.y = y;
    		
    	}
    }
}
