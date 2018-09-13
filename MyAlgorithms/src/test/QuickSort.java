package test;

public class QuickSort {
	public static void quickSort(int [] arr) {
		if (arr == null || arr.length <2) return;
		quickSortCore(arr,0,arr.length - 1);
	}
	private static void quickSortCore(int[] arr, int start, int end) {
		if (start >=end) return;
		int [] temp = partition(arr,start,end);
		quickSortCore(arr,start,temp[0]);
		quickSortCore(arr,temp[1],end);
		
	}
	public static int[] partition(int[] arr, int start, int end) {
		int less = start - 1;
		int more = end + 1;
		int cur = start;
		int num = arr[end];
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
		return new int [] {less,more};
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {2,4,6,1,5,7,8,5,3,5,7,8,8};
		quickSort(arr);
		for (int num: arr) {
			System.out.println(num);
		}
	}
}