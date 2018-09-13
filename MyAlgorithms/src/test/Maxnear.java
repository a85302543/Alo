package test;

public class Maxnear {
	public static int maxNear(int [] arr) {
		int min  = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0;i<arr.length;i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		if (max == min) return 0;
		int[] minbucket = new int [arr.length + 1];
		int[] maxbucket = new int [arr.length + 1];
		boolean[] isused = new boolean [arr.length + 1];
		for (int i = 0;i<arr.length;i++) {
			int index = findindex(max,min,arr.length,arr[i]);
			minbucket[index] = (isused[index] == true && minbucket[index]<arr[i])?minbucket[index]:arr[i];
			maxbucket[index] = (isused[index] == true && maxbucket[index]>arr[i])?maxbucket[index]:arr[i];
			isused[index] = true;
		}
		int result = 0;
		int before = 0;
		int cur;
		for (cur = 1;cur<arr.length + 1;cur++) {
			if (isused[cur]) {
				result = Math.max(result, Math.abs(minbucket[cur] - maxbucket[before]));
				before = cur;
			}
		}
		System.out.println(result);
		return result;
	}
	public static int findindex(int max,int min ,int n,int num) {
		return n*(num-min)/(max-min);
	}
	public static void main(String[] args) {
		int [] arr = {4,9,2,7,3,123,67,3,7,5,12,4,7,2,5,78,3,72,4,76,2,67,2,13};
		maxNear(arr);
}
}
