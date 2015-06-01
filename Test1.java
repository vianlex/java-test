public class  Test1{

	public void run(Car car){
		car.run();
	}


	public static void main(String[] args) {
		
		Test1 t = new Test1();
		// Car car = new QQ();
		t.run((new QQ()));

	}
}


class Car{

	public void run(){
		System.out.println("Car is running!");
	}
}

class QQ extends Car{
	
	public void run(){
		System.out.println("QQ car running!");
	}
}

class BMW extends Car{

	public void run(){
		System.out.println("BWM is running!");	
	}
}

