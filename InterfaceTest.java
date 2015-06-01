
public class InterfaceTest{
	
	public static void main(String[] args) {
		
		MyClass2 my2 = new MyClass2();
		my2.sayHi("pythoner");
		my2.whoAmI();

		Myclass1 my1 = new Myclass1();
		my1.sayHi("javaer");

	}
}


interface MyInterface1{
	public void sayHi(String who);
}



interface MyInterface2{

	public void whoAmI();
}

//java是但继承的，但是可以实现多个接口，例如下面的例子

class Myclass1 implements MyInterface1{
	
	public void sayHi(String who){
	
		System.out.println("Hello " + who);
	}
}

class MyClass2 implements MyInterface1,  MyInterface2{
	
	public void sayHi(String who){
		System.out.println("Hello  " + who);
	}

	public void whoAmI(){
		System.out.println("I am a MyInterface2y");
	}
}
