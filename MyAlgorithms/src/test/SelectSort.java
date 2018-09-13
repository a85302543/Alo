package test;

public class SelectSort {
	public static void selectSort(int arr[]) {
		if (arr == null || arr.length < 2) return;
		for (int i = 0;i<arr.length;i++) {
			int minindex = i;
			int j;
			for (j = i;j<arr.length;j++) {
				if (arr[j] < arr[minindex])
					minindex = j;
			}
			swap(arr,i,minindex);
		}
	}
			private static void swap(int[] arr, int j, int i) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
			public static void main(String[] args) {
				int [] arr = {2,4,6,1,5,7,8,5,3,5,7,8,3456,2,34,456,456,467,45,1234,123,45,7,3,7,4,3,7,3245,236,8};
				selectSort(arr);
				for (int num: arr) {
					System.out.println(num);
				}
			}
		}
