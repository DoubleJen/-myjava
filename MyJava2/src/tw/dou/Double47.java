package tw.dou;
//複製檔案V1
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Double47 {

	public static void main(String[] args) {
		long start =  System.currentTimeMillis();
		File readFile = new File("./dir1/bg1.jpg");
		File saveFile = new File("./dir2/bg1.jpg");
		
		try {
			FileOutputStream fout = new FileOutputStream(saveFile);
			FileInputStream fin = new FileInputStream(readFile);
			int b;
			while((b = fin.read()) != -1){//檔案多大就做幾次,效能較差
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("Finish");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
		


	}

}
