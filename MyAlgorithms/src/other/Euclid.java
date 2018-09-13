package other;
//欧几里得算法
public class Euclid {
	public static void main (String args[]) {
		
		System.out.println(euClid(4,6));
		
	}
	
	public static int  euClid(int p , int q) {
		if (q == 0)
			return p;
		int num = p%q;
		return euClid(q,num);

	}
}
