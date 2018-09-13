package test;

public class Flag {
	public static void flag(int[] arr , int num) {
		int less = -1;
		int more = arr.length;
		int cur = 0;
		while (cur < more) {
			if (arr[cur] <num) {
				swap(arr,cur++,++less);
				}
			else if (arr[cur] > num) {
				swap(arr,cur,--more);
			}
			else {
				cur++;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {2,4,6,1,5,7,8,5,3,5,7,8,8};
		flag(arr,5);
		for (int num: arr) {
			System.out.println(num);
		}
	}
}
