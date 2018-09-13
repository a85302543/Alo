package other;

import java.util.Scanner;

public class testScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String len = scanner.nextLine();
		int leng = Integer.parseInt(len);
		int[][] temp = new int[leng][leng];
		for (int i = 0;i<leng;i++) {
			String s = scanner.nextLine();
			String [] str = s.split(",");
			for (int j= 0;j<leng;j++) {
				temp[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int i =0;i<temp.length;i++) {
			for (int j=0;j<temp[0].length;j++)
				System.out.print(temp[i][j] + " ");
			System.out.println();
		}
		
	}
}
