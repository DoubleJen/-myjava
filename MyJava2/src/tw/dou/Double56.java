package tw.dou;
//TCP接收
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Double56 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			//System.out.println("before");
			Socket socket = server.accept();//一旦傳成功socket會被傳進來 變成socket對socket
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			int i; String line;
			while((line= reader.readLine()) != null){
				System.out.print(line);
			}
			reader.close();
			
			//System.out.println("after");
			server.close();
			//System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
