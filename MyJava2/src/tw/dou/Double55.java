package tw.dou;
//TCP發送
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Double55 {

	public static void main(String[] args) {
			try {
				Socket socket = new Socket(InetAddress.getByName("10.1.6.65"), 9999);//看對方要佈要跟我講話//可配合cmd netstat /an檢查
				System.out.println("port: ");
				
				OutputStream out = socket.getOutputStream();
				out.write("Hello BBBBBBBBBBBBBBBBBrad!!!".getBytes());
				out.flush();
				out.close();
				
				socket.close();
			} catch (Exception e) {
				System.out.println();
			}
		
		
		

	}

}
