
public class TestStatic {
	
	static TestStatic test2 = new TestStatic();
	{System.out.println("A");}
	static{System.out.println("B");}
	public static void main(String[] args) {
		TestStatic test1 = new TestStatic();
	}
	
}
