public class Test{

	public int add(int x, int y){
		return x + y;
	}

	public String add(String str1, String str2){
		return str1 + str2;
	}

	public double add(double x, double y){
		return x + y;
	}

	public static void main(String[] args){
		Test test = new Test();
		System.out.println(test.add(1, 3) + '\n');
		System.out.println(test.add("I am a ", "pythoner") + '\n');
		System.out.println(test.add(2.4 , 5.8));
	}

}

