import java.util.HashMap;

public class HashMapTest
{
	public static void main(String[] args) {
		// System.out.println("I");	
		Inte i = new in();
		String str = i.name() ;
		System.out.println(str);

		HashMap map = new HashMap();
		map.put(12, 32);
		map.put(12, 13);
		map.put("H", "12");
		map.put("H", "sd");
		System.out.println(map);


	}
}

interface Inte 
{
	public String name();
}

class in implements Inte
{
	public String name(){
		return "My name is in";
	}
}