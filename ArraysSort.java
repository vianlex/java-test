import java.util.Arrays;

public class ArraysSort
{
	public static void main(String[] args) {
		
		int[] a  = {1, 2, 3, 4, 5};
		int[] b  = {1, 2, 3, 4, 5};

		System.out.println(Arrays.equals(a, b));
		System.out.println(a == b);
		System.out.println(a.equals(b));

		int[] a3 = new int[5];
		System.arraycopy(a, 0, a3, 0, a3.length);
		for (int value : a3) {
			// System.out.println(value);
		}
		
		int[] c = {2,10,5,6,8,1,0,23,7};
		A a1 = new A();
		// a1.sort1(c);
		a1.sort2(c);
		for (int value :c ) {
			System.out.println(value);
		}

	}
}



//冒泡排序法
class A
{
	public void sort1(int[] a)
	{
		
		for(int k = a.length - 1 ; k >= 0; k--)
			{
				for (int i = 0 ; i < k; ) {
			 		if(a[i] > a[++i])
						{
			 				a[i - 1] = a[i - 1] - a[i];
			 				a[i] = a[i] + a[i - 1];
			 				a[i - 1] = a[i] - a[i -1];
			 			}
				}
			}
			
	}

	public void sort2(int[] a)
	{
		for (int i = 0 ; i < a.length - 1 ; i++) {
			for (int k = 0 ; k < a.length - i - 1 ; ) {
				if (a[k] > a[++k]) {
					int temp = a [k];
					a[k] = a[k - 1];
					a[k - 1] = temp;

				}
			}
		}
	}
}