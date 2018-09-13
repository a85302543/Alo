package other;

import java.util.Scanner;

public class BinarySearchXIECHENG {
	public static int binarySearchxiecheng(int arr[],int aim) {
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
		return -1-start;
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int target = in.nextInt();
		int len = in.nextInt();
		if (len <=0) return;
		int []arr = new int[len];
		for (int i=0;i<len;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(binarySearchxiecheng(arr, target));
	}
}
