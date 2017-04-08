package tw.dou;
//接收
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class Double54 {

	public static void main(String[] args) {
//		while(true){
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);//接收須指定PORT
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);//接收
				socket.close();
				int len = packet.getLength();
				byte[] rdata = packet.getData();
				String urip = packet.getAddress().getHostAddress();
				System.out.println(urip+ "=>" + new String(rdata, 0, len));
			} catch (Exception e) {
				System.out.println(e.toString());
			}
//		}
			

	}

}
