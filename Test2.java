public class Test2
{
	public static void main(String[] args) {
		
		Cale c = new Cale<String>();
		c.name = "I am a String";
		System.out.println(c.name);

	}
}

class Cale<T>
{
	T name;
}