package sort;

public class GuiBingSort {
	public static  void sort (int [] arr) {
		int [] temp = new int [arr.length];
		sortCore(arr,0,arr.length - 1,temp);
	}

	private static void sortCore(int[] arr, int start, int end, int[] temp) {
		if (start < end) {
		int mid = (start + end)/2;
		sortCore(arr,start,mid,temp);
		sortCore(arr,mid + 1,end,temp);
		merge(arr,start,mid ,end ,temp);
		}
	}

	private static void merge(int[] arr, int leftstart, int leftend, int rightend, int[] temp) {
		int leftpos  = leftstart;
		int rightpos = leftend + 1;
		int temppos = leftstart;
		while (leftpos <= leftend && rightpos <= rightend) {
			if (temp[leftpos] <= temp[rightpos])
				temp[temppos++] = arr[leftpos++];
			else {
				temp[temppos++] = arr[rightpos++];
			}
		}
		while (leftpos <= leftend)
			temp[temppos++] = arr[leftpos++];
		while (rightpos <= rightend)
			temp[temppos++] = arr[rightpos++];
		for (int pos = temppos - 1;pos >=leftstart;pos--) {
			arr[pos] = temp[pos];
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,7};
		sort(arr);
		for(int i:arr)
			System.out.println(i);
	}
}
