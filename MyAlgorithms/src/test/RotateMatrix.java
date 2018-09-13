package test;

public class RotateMatrix {
	public static void rotateMatrix(int [][] arr) {
		if (arr == null ||arr.length < 1) return;
		int startR = 0;
		int endR = arr.length - 1;
		int startC = 0;
		int endC = arr.length - 1;
		while (startR < endR) {
			rotateMatrixCore(arr,startR++,endR--,startC++,endC--);
		}
	}

	private static void rotateMatrixCore(int[][] arr, int startR, int endR, int startC, int endC) {
		int count = endR - startR;
		for (int i = 0;i<count;i++) {
			int temp = arr[startR][startC + i];
			arr[startR][startC + i] = arr[endR - i][startC];
			arr[endR - i][startC] = arr[endR ][endC-i];
			arr[endR ][endC-i] = arr[startR+i][endC];
			arr[startR+i][endC] = temp;
		}
		
	}
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3,6}, { 5, 6, 7,8}, { 9, 10, 11 ,23},{ 56, 0, 1 ,23}
				};
		rotateMatrix(matrix);
		for (int i = 0; i != matrix.length; i++) {
			for (int j = 0; j != matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}


}
}