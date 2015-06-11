import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(6000);
		
		Socket so = server.accept();

		OutputStream out = so.getOutputStream();
		out.write("connect succeed".getBytes());
		
		out.close();
		server.close();
		
		
	}
}
