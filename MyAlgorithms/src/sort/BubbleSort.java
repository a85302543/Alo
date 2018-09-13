package sort;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for (int i = 0 ;i<arr.length;i++) {
				for (int j = arr.length -1;j>i;j--) {
					if (arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					}
				}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,6,7,5,23,1,7,9};
		bubbleSort(arr);
		for (int num : arr)
			System.out.println(num);
	}
}
