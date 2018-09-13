package other;
public class RotateArr {
	public static void rotateArr(int[][] arr) {
		if (arr.length == 0 || arr == null) return;
		int startR = 0,startC = 0,endR = arr.length - 1,endC = arr[0].length - 1;
		while(startR < endR) {
			Core (arr,startR++,startC++,endR--,endC--);
		}
	}

	private static void Core(int[][] arr, int startR, int startC, int endR, int endC) {
		int n = endC - startC;
		for (int i =0;i < n;i++ ) {
			int temp = arr[startR][startC + i];
			arr[startR][startC + i] = arr[endR - i][startC];
			arr[endR - i][startC] = arr[endR][endC-i];
			arr[endR][endC-i] = arr[startR+ i][endC];
			arr[startR+ i][endC] = temp;
		}
		
	}
	public static void main(String[] args) {
		int[][] arr = {{7,4,1},{2,5,8},{3,6,9}};
		rotateArr(arr);
		for (int i = 0;i<arr.length;i++)
		{
			for (int j = 0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
