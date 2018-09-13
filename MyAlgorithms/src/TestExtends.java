
public class TestExtends {
  public static void main(String[] args) {
	Father wenhao = new son();
	System.out.println(wenhao.i);
	wenhao.say();
}
}
class Father{
	int i =0;
	public  void say(){
		System.out.println("Father");
	}
}
class son extends Father{
	int i =1;
	public void say(){
		System.out.println("son");
	}
	public void sayson(){
		System.out.println("sson");
	}
}