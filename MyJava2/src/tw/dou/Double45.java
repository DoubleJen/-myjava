package tw.dou;
//IO寫出去
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Double45 {

	public static void main(String[] args) {
		int a=1, b=2; String c="Dou", d="資策會";
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(a);
			dout.writeInt(b);
			dout.writeChars(c);
			dout.writeUTF(d);
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			
		}
		

	}

}
