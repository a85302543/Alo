package sort;

public class ShellSort {
	public void shellSort(int [] arr) {
		for(int gap = arr.length/2;gap>0;gap/=2) {
			for (int p = gap;p<arr.length;p++) {
				int temp = arr[p];
				int j = 0;
				for (j = p;j>=gap && temp <arr[j-gap];j-=gap)
					arr[j] = arr[j-gap];
				arr[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,7,1,4,6,9,2,8};
		new ShellSort().shellSort(arr);
		for(int num : arr)
			System.out.println(num);
	}
}
