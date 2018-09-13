package other;

public class BinarySearch {
	

	
	public static int BinarySearch(int arr[],int aim) {
		int start  = 0;
		int end  = arr.length-1;
		while (start <= end) {
			int mid = (start+end)/2;
			if (arr[mid] == aim) return mid;
			if (arr[mid] > aim) {
				end = mid - 1;
			}
			if(arr[mid] < aim) {
				start = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,6,8,9,13,34,56,788};
		int aim = 13;
		System.out.println(BinarySearch(arr, aim));
	}
}
