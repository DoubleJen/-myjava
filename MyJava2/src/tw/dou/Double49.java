package tw.dou;
//序列化
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Double49 {

	public static void main(String[] args) {
		Student s1 = new Student("Dou", 80, 80, 86);
		Student s2 = new Student("Tom", 70, 60, 86);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/brad.object"));
			oout.writeObject(s1);//Student這個類別需備序列化
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
		

	}

}
