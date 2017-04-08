package tw.dou;
//發送
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Double53 {

	public static void main(String[] args) {
		//UDP(非連接導向:把封包傳給你不管你收不收,手遊用此傳遞才會快)
		//TCP(連接導向:傳遞訊息前確定有無在等我,有我才發送)如ftp smtp pop3均是
		String data = "hello, test";
		byte[] sendData = data.getBytes();//字串轉陣列
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length, 
					InetAddress.getByName("127.0.0.1"), 8888);//0-1024為well-known port//127.0.0.1自己連自己
			socket.send(packet);//把packet包在socket發送出去
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
