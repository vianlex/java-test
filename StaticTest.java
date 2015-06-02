public class StaticTest {

	public static void main(String[] args) {
		
		S1 s1 = new S1();
		s1.staticMethod();
		S1.staticMethod();

		S1 s = new S2();
		s.staticMethod();
	}
}

class S1{
	public static void staticMethod(){
		System.out.println("I am static method of S1");
	} 
}

class S2 extends S1{
	public static void staticMethod(){
		System.out.println("I am static method of S2");
	}
}

