package other;

public class CountIsLand {
	public static int findisLand(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int count = 0;
		for (int i =0;i<row;i++) {
			for (int j=0;j<col;j++) {
				if (arr[i][j] == 1) {
					infection(arr,i,j,row,col);
					count++;
				}
			}
		}
		return count;
	}

	private static void infection(int[][] arr, int i, int j, int row, int col) {
		arr[i][j] = 2;
		if(i+1<row&&arr[i+1][j] == 1) {
			infection(arr,i+1,j,row,col);
		}
		if(i-1>=0&&arr[i-1][j] == 1) {
			infection(arr,i-1,j,row,col);
		}
		if(j+1<col&&arr[i][j+1] == 1) {
			infection(arr,i,j+1,row,col);
		}
		if(j-1>=0&&arr[i][j-1] == 1) {
			infection(arr,i,j-1,row,col);
		}
		
	}
	public static void main(String[] args) {
		int[][] arr = {{0,0,1,0,1,0},{1,1,1,0,1,0},{1,0,0,1,0,0},{1,0,0,1,0,1}};
		int num = findisLand(arr);
		System.out.println(num);
	}
}
