import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest
{
	public static void main(String[] args) {
		
		HashSet<Object> set = new  HashSet<Object>();
		set.add(new Persion("Python"));
		set.add(new Persion("Python"));
		System.out.println(set);

		System.out.println(" --------------------- ");
		HashSet set2 = new HashSet();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		for(Iterator ite = set2.iterator(); ite.hasNext();)
		{
			String str = (String)ite.next();
			System.out.println(str);
		}

	}
}

class Persion
{
	String name;
	public Persion(String name)
	{
		this.name = name;
	}

	public int hashCode(){ 
		return this.name.hashCode();
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj != null && obj instanceof Persion)
		{
			Persion p = (Persion)obj;
			if(name.equals(p.name))
			{
				return true;
			}
		}
		return false;
	}
}