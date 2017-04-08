package tw.dou;
//發送圖檔
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Double57 {

	public static void main(String[] args) {
			try {
				File sendFile = new File("./dir1/bg1.jpg");
				byte[] buf = new byte[(int)sendFile.length()];
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
				bin.read(buf);
				bin.close();
				
				
				Socket socket = new Socket(InetAddress.getByName("10.2.1.121"), 9999);//看對方要佈要跟我講話//可配合cmd netstat /an檢查
				System.out.println("port: ");
				
				OutputStream out = socket.getOutputStream();
				out.write(buf);
				out.flush();
				out.close();
				
				socket.close();
			} catch (Exception e) {
				System.out.println();
			}
		
		
		

	}

}
