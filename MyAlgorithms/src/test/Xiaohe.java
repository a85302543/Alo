package test;

public class Xiaohe {
	 static int num = 0;
	public static void mergeSort(int arr[]) {
		if (arr == null || arr.length <2) return;
		mergeSortCore (arr,0,arr.length - 1);
		
	}

	private static void mergeSortCore(int[] arr, int left, int right) {
		if (left >= right) return;
		int mid = (left + right) >> 1;
		int [] temp = new int[arr.length];
		mergeSortCore(arr,left,mid);
		mergeSortCore(arr,mid + 1,right);
		merge(arr,left,mid + 1,right,temp);
		
	}

	private static void merge(int[] arr, int leftstart, int rightstart, int rightend,int []temp) {
		int leftpos = leftstart;
		int rightpos = rightstart;
		int leftend = rightstart - 1;
		int position = leftstart;
		while (leftpos<=leftend && rightpos <= rightend) {
			if (arr[leftpos] <= arr[rightpos]) {
				num += arr[leftpos] * (rightend - rightpos + 1);
				temp[position++] = arr[leftpos++];
			}else {
				temp[position++] = arr[rightpos++];
			}
		}
		while (leftpos<=leftend)
			temp[position++] = arr[leftpos++];
		while (rightpos<=rightend)
			temp[position++] = arr[rightpos++];
		for (int i = position - 1;i>=leftstart;i--) {
			arr[i] = temp[i];
		}
	}
	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}
	public static void main(String[] args) {
		int [] arr = {1,3,4,2};
		mergeSort(arr);
		System.out.println(num);
	}
	}