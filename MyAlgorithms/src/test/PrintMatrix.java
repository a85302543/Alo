package test;

public class PrintMatrix {
	public static void printMatrix(int[][] arr) {
		if (arr == null || arr.length <1) return ;
		int startR = 0;
		int startC = 0;
		int endR = arr.length - 1;
		int endC = arr[0].length - 1;
		while (startR <= endR && startC<=endC) {
			if (startR == endR) {
				for (int i = startC;i<=endC;i++)
					System.out.println(arr[startR][i]);
				break;
			}
			if (startC == endC) {
				for (int i = startR;i<=endR;i++)
					System.out.println(arr[i][startC]);
				break;
			}
			for (int i = startC;i<endC;i++)
				System.out.println(arr[startR][i]);
			for (int i = startR;i<endR;i++)
				System.out.println(arr[i][endC]);
			for (int i = endC;i>startC;i--)
				System.out.println(arr[endR][i]);
			for (int i = endR;i>startR;i--)
				System.out.println(arr[i][startC]);
			startR++;startC++;endR--;endC--;
		}
		
	}
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3}, { 5, 6, 7}, { 9, 10, 11 },
				};
		printMatrix(matrix);


}
}
