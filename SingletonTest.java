public class SingletonTest
{
	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.name);
		singleton.name = "javaer";
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.name);

	}
	
}

class Singleton
{
	 private static Singleton singleton = new Singleton();
	 String name = "pythoner";
	private Singleton(){
		System.out.println("I am a Singleton");
	}

	public static Singleton getInstance(){
		return singleton;
	}
}