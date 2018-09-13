package other;
public class FindBucket {
	public static int findBucket(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0;i<arr.length;i++) {
			 max = Math.max(max, arr[i]);
			 min = Math.min(min, arr[i]);
		}
		if (max == min) return 0;
		int [] bucketmax = new int [arr.length + 1];
		int [] bucketmin = new int [arr.length + 1];
		boolean[] hasNum = new boolean[arr.length + 1];
		for (int num : arr) {
			int bid = bucket(num,arr.length,max,min);
			bucketmax[bid] = !hasNum[bid] || num > bucketmax[bid]? num:bucketmax[bid];
			bucketmin[bid] = !hasNum[bid] || num < bucketmin[bid]? num:bucketmin[bid];
			hasNum[bid] = true;
		}
		int lastmax = bucketmax[0];
		int res = 0;
		int i = 1;
		for (;i<bucketmax.length;i++) {
			if (hasNum[i]) {
				res = Math.max(res, bucketmin[i] - lastmax);
				lastmax = bucketmax[i];
			}
		}
		return res;
	}

	private static int bucket(int num, int length, int max, int min) {
		return ((num - min) * length)/(max - min);
	}
	public static void main(String[] args) {
		int arr[] = {1,4,5,8,10,13,17,78,99,88};
		System.out.println(findBucket(arr));
	}
}
