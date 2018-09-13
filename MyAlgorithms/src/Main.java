import java.util.*;

public class Main {
	public static MyObject[] parseSampleIeInput() {
		Scanner in = new Scanner(System.in);
		List<MyObject> inList = new ArrayList<>();
		while(in.hasNextInt()) {
			int id = in.nextInt();
			int score = in.nextInt();
			inList.add(new MyObject(id, score));
			
		}
		MyObject[] a = new MyObject[inList.size()];
		return inList.toArray(a);
	}
	public static void main(String[] args) {
		MyObject[] a = parseSampleIeInput();
		sort(a);
		System.out.println("Result :" + Arrays.toString(a));
	}
	public static void sort( MyObject[] a) {
		for (int i = 0 ;i<a.length;i++) {
			for (int j = a.length -1;j>i;j--) {
				if (a[j].score<a[j-1].score) {
				MyObject temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				}
			}
	}
}

	static class MyObject{
		int id;
		@Override
		public String toString() {
			return "{" + id + ";" + score+"}";
		}
		public MyObject(int id, int score) {
			super();
			this.id = id;
			this.score = score;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		int score;
	}
}
