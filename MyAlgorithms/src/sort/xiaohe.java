package sort;

public class xiaohe {
	public static int xiaohe(int []arr) {
		if (arr.length == 0 || arr == null) return 0;
		return xiaoheCore(arr,0,arr.length - 1);
	}

	private static int xiaoheCore(int[] arr, int start, int end) {
		if (start >= end) return 0;
		int nums = xiaoheCore (arr,start,end - 1);
		int temp = 0;
		for (int i = start;i<=end;i++) {
			if (arr[end] > arr[i]) temp+=arr[i];
		}
		return temp + nums;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5};
		System.out.println(xiaohe(arr));
	}
}
