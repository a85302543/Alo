import javax.swing.plaf.synth.SynthColorChooserUI;

public class TestSubandMain {
	boolean flag = true;
	public synchronized void mainMethod() throws InterruptedException {
		while (flag) {
			wait();
		}
		for (int i =0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() +"main LOOP " + i);
		}
		Thread.sleep(1000);
		flag = true;
		notify();
	}
	public synchronized void subMethod () throws InterruptedException {
		while (!flag) {
			wait();
		}
		for (int i =0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() +"sub LOOP " + i);
		}
		Thread.sleep(1000);
		flag = false;
		notify();
	}
	public static void main(String[] args) {
		final TestSubandMain t = new TestSubandMain();
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i =0;i<3;i++) {
					try {
						t.subMethod();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
			
		});
		thread.start();
		for (int i =0;i<3;i++) {
			try {
				t.mainMethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

