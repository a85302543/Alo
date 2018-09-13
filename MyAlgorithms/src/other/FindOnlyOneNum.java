package other;

public class FindOnlyOneNum {
	public static void main(String[] args)
	{

	int[] array = {2,3,4,4,3,5,6,6,5};

	int v = 0;

	for (int i = 0;i < array.length;i++) {

	v ^= array[i];

	}

	System.out.println("只出现一次的数是:" + v);

	}
}
