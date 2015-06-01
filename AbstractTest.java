public class AbstractTest{

	public static void main(String[] args) {
		Add caleAdd = new Add();
		System.out.println(caleAdd.add(3, 9));
		System.out.println("---------------------------------");
		System.out.println(caleAdd.div(2,1));
		System.out.println("---------------------------------");
		System.out.println(caleAdd.name);

	}
}

abstract  class Cale{

	public String name = "cale";
	

	public abstract int add(int a, int b);
	
	public abstract String add(String str1, String str2);
	
	public abstract double add(double d1, double d2);
	
	public abstract float add(float f1, float f2);

	public int div(int div1, int div2){
		return div1/div2;
	}

}

class Add extends Cale{


	public int add(int a, int b){
		return a + b;
	}

	public String add(String str1, String str2){
		return str1 + str2 ;
	}

	public double add(double d1, double d2){
		return d1 + d2;
	}

	public float add(float f1, float f2){
			return f1 + f2;
	}

}