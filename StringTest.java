public class StringTest
{
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println(str1 == str2);
		System.out.println(str2.equals(str1));
	
		String str3 = new String("bbb");
		String str4 = new String("bbb");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));  
	}
}