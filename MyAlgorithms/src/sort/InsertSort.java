package sort;

public class InsertSort {
	public static void InsertSort(int arr[]) {
		for (int i = 1;i < arr.length;i++) {
			int temp = arr[i];
			int j;
		for (j = i ;temp<arr[j-1] && j>=1;j--)
			arr[j] = arr[j -1];
		arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,3,6,45,3,5,3,2,2};
		InsertSort(arr);
		for(int i:arr)
			System.out.println(i);
	}
}
