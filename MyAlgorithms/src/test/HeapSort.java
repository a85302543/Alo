package test;

public class HeapSort {
	public static void heapSort(int[] arr ) {
		if (arr == null|| arr.length <2) return;
		heapInsert(arr);
		for (int i = arr.length;i>=1;i--) {
			System.out.println(heapfiy(arr,i));
		}
	}
	public static void heapInsert(int [] arr) {
		for (int i = 0; i<arr.length;i++) {
			int j = i;
			while (j>0) {
				if (arr[j] < arr[j/2])
					swap(arr,j,j/2);
				else break;
				j/=2;
			}
		}
	}
	public static int  heapfiy(int[]arr, int num) {
		num--;
		swap(arr,num,0);
		int cur = 0;
		while (cur*2+1< num) {
			int min = (cur*2+2 < num && arr[cur*2+2]<arr[cur*2+1])?cur*2+2 : cur*2+1;
			min = (arr[cur]>arr[min])?min:cur;
			if (cur == min) break;
			swap(arr,cur,min);
			cur = min;
		}
		return arr[num];
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {4,9,2,7,66,8,3,1,5};
		heapSort(arr);
	}
}
