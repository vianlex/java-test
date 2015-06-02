public class FinalTest
{
	public static void main(String[] args) {
		F1 f1 = new F1();
		f1.method();

		f1 = new F2();
		f1.method();
		
		F2 f2 = new F2();
		System.out.println(f2.f1Name.name);
		f2.f1Name.name = "Pythoer";
		System.out.println(f2.f1Name.name);

	}
}

class F1{

	String name = "My name is F1";

	public  void method(){
		System.out.println("I can not @voerride");
	}
}


class F2 extends F1
{
	
	final F1 f1Name = new F1();  //f1Name只能指向F1，但是f1name的属性可以改变

	public final void method(){
		System.out.println("I am F2");
	}
}