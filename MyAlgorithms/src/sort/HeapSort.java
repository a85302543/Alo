package sort;

public class HeapSort {
	public static void buildHeap(int[] arr ,int size) {
		for (int i=0;i<size;i++) {
			int index = i;
			while (index > 0) {
				if (arr[index] > arr[(index-1)/2]) {
					swap(arr,index,(index-1)/2);
					index = (index-1)/2;
				}
				else {
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void HeapSort (int arr[]) {
		if (arr == null || arr.length < 2) return;
		buildHeap(arr,arr.length);
		for (int i = arr.length;i>=1;i--) {
			System.out.println(heapfily(arr,i));
		}
	}
	private static int heapfily(int[] arr, int size) {
		swap(arr,0,size - 1);
		int index = 0;
		while ((2*index + 1) < size - 1) {
			int largest = (((2*index + 2) < size - 1) && arr[2*index + 2] > arr[2*index + 1])?2*index + 2 :2*index + 1;
			largest  = (arr[largest] > arr[index])?largest:index;
			if (largest == index) break;
			swap(arr,index,largest);
			index = largest;	
		}
		return arr[size - 1];
	}

	public static void main(String[] args) {
		int [] arr = {1,4,2,5,7,5,76,7,5,4,2,2,5,7,9,9,8,7,67,56,5,4,3,3,2};
		HeapSort(arr);
	}
}
