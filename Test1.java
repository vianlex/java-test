public class Test1
{
	public static void main(String[] args) {
		Man man = new Man(1);
	}
}

class Persion
{
	public Persion(){
		System.out.println("I am Persion");
	}

}

class Man extends Persion
{
	public Man(int i){
		System.out.println("I am Man");
	}
}