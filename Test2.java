public class Test2
{
	public static void main(String[] args) {
		
		Orange or = new Orange();
		or.orange();
		or.apple();
		

	}
}

abstract class Fruit{

	public abstract void apple();
	public abstract void orange();
}

abstract class Apple extends Fruit
{
	public void apple(){
		System.out.println("I am apple");
	}
}

class Orange extends Apple{
	public void orange(){
		System.out.println("I am Orange");
	}
}