package tw.dou;
//序列化與繼承
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Double51 {

	public static void main(String[] args) {
		Double513 obj = new Double513();
		//序列化, 序列化在哪將影響解序列化出來的東西
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Double511"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("------------------");
		//解序列化
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/Double511"));
			Double513 obj2 = (Double513)oin.readObject();
			oin.close();
		} catch (Exception ee) {
		} 
		
	}

}

class Double511 implements Serializable{//祖父已被序列化,其子孫均被序列化
	public Double511() {System.out.println("Double511()");}	
}

class Double512 extends Double511{
	public Double512() {System.out.println("Double512()");}
}

class Double513 extends Double512{
	public Double513() {System.out.println("Double513()");}
}