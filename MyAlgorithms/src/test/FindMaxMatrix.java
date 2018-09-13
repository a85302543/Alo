package test;

public class FindMaxMatrix {
	public static boolean findMaxMatrix(int[][] arr ,int num) {
		int endR = arr.length - 1;
		int endC = arr[0].length - 1;
		if (num < arr[0][0] || num>arr[endR][endC] ) return false;
		int indexR = 0;
		int indexC = endC;
		while (indexR <= endR && indexC>=0 ) {
			if (arr[indexR][indexC] == num) return true;
			else if(arr[indexR][indexC]<num) indexR++;
			else indexC--;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2,5}, { 2, 3, 4,7}, { 4, 4, 4 ,8},{ 5, 7, 7 ,9}
				};
		System.out.println(findMaxMatrix(matrix,5));
		}

}
