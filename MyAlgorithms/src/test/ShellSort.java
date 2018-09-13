package test;


public class ShellSort {
	public static void insertSort(int [] arr ) {
		int gap = arr.length/2;
		for (;gap>=1;gap/=2) {
		for (int i = gap;i < arr.length;i+=gap) {
			for (int j = i;j>0 && arr[j] <= arr[j-gap];j-=gap) {
				swap(arr,j,j-gap);
			}
		}
	}
}

private static void swap(int[] arr, int j, int i) {
	int temp = arr[j];
	arr[j] = arr[i];
	arr[i] = temp;
	
}
public static void main(String[] args) {
	int [] arr = {2,4,6,1,5,7,8,5,3,5,7,8,3456,2,34,456,456,467,45,1234,123,45,7,3,7,4,3,7,3245,236,8};
	insertSort(arr);
	for (int num: arr) {
		System.out.println(num);
	}
}
}
