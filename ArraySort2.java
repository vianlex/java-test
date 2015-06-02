public class ArraySort2
{
	public static void main(String[] args) {
		
		int[] array = {1,5,9,12,16,23,32,45,56};


		ArraySort2 a = new ArraySort2();
		int value =  a.binraySearch(array, 56);
		System.out.println(value + "     " + array[value]);
		

	}


	public  int binraySearch(int[] array, int value)
	{
		this.sayHi();
		int low = 0;
		int high = array.length - 1;
		int middle;
		
		while(high >= low)
		{
			middle = (high + low)/2;

			if(array[middle] == value)
				return middle;

			else if(array[middle] > value)
				high = middle - 1;

			else if(array[middle] < value)
				low = middle + 1;
		}

		return -1;

	}


	public void sayHi()
	{
		System.out.println("Hello world");
	}
}

