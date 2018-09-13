package dpAndGreedy;

public class N {
	public static int countN(int N) {
		return 0;
	}
	public static int countNCore(int N,int[] arr) {
		if (N == 1) {
			arr[0] = 1;
			return arr[0];
		}
		arr[N] = countNCore(N-1,arr) *N;
		return arr[N];
	}
	public static void main(String[] args) {
		System.out.println(countN(4));
	}
}
