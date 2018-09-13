package lin.solution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		 ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		 cachedThreadPool.execute(new TestThread());
		 cachedThreadPool.execute(new TestThread());
		 cachedThreadPool.execute(new TestThread());
		 cachedThreadPool.execute(new TestThread());
	}
}
