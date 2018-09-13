package sort;

public class xiaoheright {
	public static  void count (int [] arr) {
		int [] temp = new int [arr.length];
		System.out.println(xiaohe(arr,0,arr.length - 1,temp));
	}

	private static int xiaohe(int[] arr, int start, int end, int[] temp) {
		if (start >= end) return 0;
		int mid = (start + end)/2;
		return xiaohe(arr,start,mid,temp)+xiaohe(arr,mid + 1,end,temp)+merge(arr,start,mid ,end ,temp);
		}

	private static int merge(int[] arr, int leftstart, int leftend, int rightend, int[] temp) {
		int leftpos  = leftstart;
		int rightpos = leftend + 1;
		int temppos = leftstart;
		int res = 0;
		while (leftpos <= leftend && rightpos <= rightend) {
			if (arr[leftpos] < arr[rightpos]) {
				res+= (arr[leftpos] *(rightend - rightpos +1));
				temp[temppos++] = arr[leftpos++];
			}
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
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,5};
		count(arr);
		for (int num: arr)
			System.out.println(num);
	}
}