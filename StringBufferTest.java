public class StringBufferTest
{
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello ");
		buffer.append("world ");
		buffer.append(false);
		buffer.append(" ");
		buffer.append(100);
		buffer.insert(0 , "  java ");
		System.out.println(buffer);
		System.out.println(buffer.toString());
	}
}