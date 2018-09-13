
public class TestRunnable implements Runnable{
	public void run() {
		System.out.println(1);
	}
	public static void main(String[] args) {
		new Thread(new TestRunnable()).start();
	}
}
