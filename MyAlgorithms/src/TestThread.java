
public class TestThread extends Thread{
	static int  i =1;
	public void run() {
		System.out.println(i++);
	}
	public static void main(String[] args) {
		TestThread t = new TestThread();
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3= new TestThread();
		t.start();
		t1.start();
		t2.start();
		t3.start();
	}
}
