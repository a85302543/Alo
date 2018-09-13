package sort;

public class selectSort {
	public void selectsort(int[] arr) {
		Integer min;
		for (int i = 0;i<arr.length;i++) {
			min  = i;
			for (int j = i;j<arr.length;j++) {
				if ( arr[j] < arr[min])
					min  = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,6,4,3,5,6,45,31};
		new selectSort().selectsort(arr);
		for (int num : arr)
			System.out.println(num);
	}
}
