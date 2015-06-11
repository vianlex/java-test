import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList arraylist = new ArrayList();
		arraylist.add("Hello ");
		arraylist.add("World");
		for(int i = 0; arraylist.size() > i; i++)
			System.out.println(arraylist.get(i));
	}
}