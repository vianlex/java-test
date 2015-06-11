import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("127.0.0.1", 6000);
		InputStream in = client.getInputStream();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(in));
		
		String str = null;
		while(null != (str = buffer.readLine()))
			System.out.println(str);
		
		
		buffer.close();
		client.close();
		
	}
}
