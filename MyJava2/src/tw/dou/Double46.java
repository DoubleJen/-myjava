package tw.dou;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Double46 {

	public static void main(String[] args) {
		try {
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			int a = din.readInt();
			int b = din.readInt();
//			char c1 = din.readChar();
//			char c2 = din.readChar();
//			char c3 = din.readChar();
//			char c4 = din.readChar();
//			char c5 = din.readChar();
			String c = din.readUTF();
			String d1 = din.readUTF();
			System.out.println("=> " + a + " : " + b +" : " + c +" : " + d1);
			din.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
