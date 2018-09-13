package sort;

public class QuickSort {
    public static int Partition (int [] input, int start,int end){
        int temp = input[start];
        while (start < end){
            while (start<end && input[end] >= temp) end--;
            input[start] = input[end];
            while (start < end && input[start] <= temp) start++;
            input[end] = input[start];
        }
        input[end] = temp;
        return end;
    }
    public static int[] quickSort(int[] input,int start,int end) {
    	int mid = Partition(input,start,end);
    	if (start < end) {
    	quickSort(input,start,mid);
    	quickSort(input,mid + 1,end);
    	}
    	return input;
    }
    public static void main(String[] args) {
		int [] result= {5,4,1,9,6,0,10,8};
		int [] answer = quickSort(result,0,result.length -1 );
		for (int a : answer) {
			System.out.println(a + " ");
		}
	}
}
