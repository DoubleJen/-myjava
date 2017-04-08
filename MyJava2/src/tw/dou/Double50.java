package tw.dou;
//解序列化
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Double50 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();
			Object obj2 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;//解序列化, 因數學帶有transient修飾字, 所以數學的成績不會被帶出
			Student s2 = (Student)obj2;
			System.out.println(s1.getname() + " : "+ s1.sum() + " : " + s1.avg());
			System.out.println(s2.getname() + " : "+ s2.sum() + " : " + s2.avg());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} 

	}

}
