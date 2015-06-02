public class StaticBlock
{
	public static void main(String[] args)
	{
		new Q();
		new Q();
	}
}

class P
{
	static{
		System.out.println("I am staticblock of p");
	}

	public P(){
		System.out.println("I am consturctor of P");
	}
}

class Q extends P
{
	static{
		System.out.println("I am a static block of Q ");
	}

	public Q(){
		System.out.println("I am consturctor of Q");
	}
}