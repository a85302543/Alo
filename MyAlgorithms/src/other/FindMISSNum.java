package other;

public class FindMISSNum {
	public static int  findMissNum(int[]arr) {
		int index =-1;
		int result= -1;
		for (int i = 0;i<arr.length;i++) {
			if (arr[i] >=0) {
				index = i;
				result = arr[i];
				break;
			}
			
		}
		if (result == -1 || index == -1) return -1;
		for (int i=index+1;i<arr.length;i++) {
			if (++result != arr[i]) return result;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {-1,1,3,5,6};
		System.out.println(findMissNum(arr));
		
	}
}
