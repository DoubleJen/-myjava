package tw.dou;
//從網路傳進來gif jpg...
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Double59 {

	public static void main(String[] args) {
		try {
			URL url = new URL(
				"http://static1.squarespace.com/static/552a5cc4e4b059a56a050501/565f6b57e4b0d9b44ab87107/566024f5e4b0354e5b79dd24/1449141991793/NYCGifathon12.gif");
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.gif"));//不知道傳送過來的檔名
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096]; int len;
			while((len= bin.read(buf)) != -1){
				bout.write(buf, 0, len);//buf從零開始就這個長度
			}
			bin.close();
			bout.flush();
			bout.close();
			System.out.println("OK");
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}

	}

}
