package other;
public class PrintRotatearr {
	public static void printRotateArr(int [][] arr) {
		if (arr.length == 0 || arr == null) return;
		int startR = 0,startC = 0,endR = arr.length - 1,endC = arr[0].length - 1;
		while (startR <=endR && startC <= endC) {
			Core(arr,startR++,startC++,endR--,endC--);
		}
	}

	private static void Core(int[][] arr, int startR, int startC, int endR, int endC) {
		if (startR == endR) {
			for (int i = startC;i<=endC;i++) {
				System.out.println(arr[startR][i]);
			}
			return;
		}
		if (startC == endC) {
			for (int i = startR;i<=endR;i++) {
				System.out.println(arr[i][startC]);
			}
			return;
		}
		int cur = startC;
		while (cur < endC) {
			System.out.println(arr[startR][cur]);
			cur++;
		}
		cur = startR;
		while (cur < endR) {
			System.out.println(arr[cur][endC]);
			cur++;
		}
		cur = endC;
		while (cur > startC) {
			System.out.println(arr[endR][cur]);
			cur--;
		}
		cur = endR;
		while (cur > startR) {
			System.out.println(arr[cur][startC]);
			cur--;
		}
	}
	public static void main(String[] args) {
		int[][] arr = {{7,4,1},{2,5,8},{3,6,9}};
		printRotateArr(arr);
	}
}
