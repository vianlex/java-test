import java.util.Random;
import java.util.HashMap;

public class RandomTest
{
	public static void main(String[] args) {
		Random r = new Random();
		// System.out.println(r.nextInt(40) + 10);
		HashMap map = new HashMap();
		for(int i = 0; i < 50; i++)
		{
			int k = r.nextInt(40) + 10;
			if(map.get(new Integer(k)) == null)
			{
				map.put(new Integer(k), 1);
			}

			else{
				map.put(new Integer(k), ((Integer)map.get(new Integer(k))).intValue() + 1);
			}
		}

		System.out.println(map);
	}
}