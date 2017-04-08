package tw.dou;
//取得IP位址
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Double52 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.iii.org.tw");//無建構式無須new
			System.out.println(ip.getHostAddress());
			
			//陣列方式
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for(InetAddress ip1:ips){
				System.out.println(ip1.getHostAddress());
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
