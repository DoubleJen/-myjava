package tw.dou;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Double42 {

	public static void main(String[] args) {
		File file = new File("./dir1/Book1.csv");
		
		try {
			FileReader fr = new FileReader(file);//有根管子fr聯接近來
			BufferedReader br = new BufferedReader(fr);//
			
			String temp;
			while((temp = br.readLine()) != null){
				System.out.println(temp);
			}
			fr.close();
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
		
	}

}
