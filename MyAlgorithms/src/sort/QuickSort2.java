package sort;

public class QuickSort2 {
	public static void quickSort(int arr[]) {
		if (arr.length < 2 || arr == null) return;
		quickSortCore(arr,0,arr.length - 1);
	}

	private static void quickSortCore(int[] arr, int start, int end) {
		if (start >= end) return;
		int [] p = partition(arr,start,end);
		quickSortCore(arr,start,p[0] - 1);
		quickSortCore(arr,p[1] + 1,end);
		
	}

	private static int[] partition(int[] arr, int left, int right) {
		int less = left - 1;
		int more = right + 1;
		int cur = left;
		int temp = arr[right];
		while (cur < more) {
			if (arr[cur] < temp) {
				swap (arr,cur++,++less);
			}else if (arr[cur] > temp) {
				swap(arr,cur,--more);
			}else {cur++;
		}
	}
		return new int[] {less +1,more-1};
}

	private static void swap(int[] arr, int i, int j) {
		if (arr == null || i == j) return;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}
	public static void main(String[] args) {
		int [] arr = {3,6,1,2,3,5,2,3,56,7,8,7,5,4,3,3,2,2,4,6,8,9};
		quickSort(arr);
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
