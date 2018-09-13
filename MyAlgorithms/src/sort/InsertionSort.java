package sort;

public class InsertionSort {
	public void insertionSort (int[] arr) {
		for (int p = 1; p<arr.length;p++) {
			int j = 0;
			int temp = arr[p];
			for (j = p ; j>0 && temp < arr[j-1];j--)
				arr[j] = arr[j-1];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,7,1,4,6,9,2,8};
		new InsertionSort().insertionSort(arr);
		for(int num : arr)
			System.out.println(num);
	}
}
