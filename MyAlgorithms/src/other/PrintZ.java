package other;
public class PrintZ {
 public static void printZ(int[][] arr) {
	 if(arr.length == 0 || arr == null) return;
	 int pointer1R = 0;
	 int pointer1C = 0;
	 int pointer2R = 0;
	 int pointer2C = 0;
	 boolean flag = false;
	 while (pointer1R<arr.length) {
		 printZhelp(arr,pointer1R,pointer1C,pointer2R,pointer2C,flag);
		 pointer1R = pointer1C == arr[0].length-1? pointer1R+1:pointer1R;
		 pointer1C =  pointer1R == 0?pointer1C+1:pointer1C;
		 pointer2C =  pointer2R == arr.length-1?pointer2C+1:pointer2C;
		 pointer2R = pointer2C == 0? pointer2R+1:pointer2R;
		 flag = !flag;
	 }
	 
	 
 }

private static void printZhelp(int[][] arr, int pointer1R, int pointer1C, int pointer2R, int pointer2C, boolean flag) {
	if (flag) {
		while(pointer1R<=pointer2R && pointer1C>=pointer2C) {
			System.out.println(arr[pointer1R++][pointer1C--]);
		}
	}
		else {
			while(pointer1R<=pointer2R && pointer1C>=pointer2C) {
				System.out.println(arr[pointer2R--][pointer2C++]);
			}
		}
	}
public static void main(String[] args) {
	int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	printZ(arr);
}
}

