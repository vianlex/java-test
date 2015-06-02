public class WarpClass 
{
	public static void main(String[] args) {
		
		int i = 90;
		int[] a1 = {1,2,3};
		int[] a2 = new int[5];
		int[] a3 = new int[]{1,2,3,4,5};
		System.out.println(a3[1]);

		Integer integer = new Integer(i);
		int ii = integer.intValue();

		System.out.println(i == ii);
		System.out.println(integer.equals(i));
		System.out.println( i == integer);
	}
}