package tw.dou;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Double44 {

	public static void main(String[] args) {
		String data =  "Hello, D\nLine1\nLine2\n";
		File outFile = new File("./dir1/brad.txt");
		
//		try {
//			FileInputStream fin = new FileInputStream(outFile);
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}//brad.txt不存在時,input不到,顯示java.io.FileNotFoundException: .\dir1\brad.txt (系統找不到指定的檔案。)
	
		try {
			FileOutputStream fout = new FileOutputStream(outFile, true);//每執行一次, 會加新的在前次後面, 適合寫使用者log檔
			//FileOutputStream fout = new FileOutputStream(outFile);//每執行一次會複寫前次的
			fout.write(data.getBytes());//data.getBytes()字串內容轉byte陣列//寫入字串data內容,不用擔心中文
			fout.flush();//至少close前flush,建議data很大時務必執行
			fout.close();
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}//brad.txt不存在時,output出一個新的,需fresh

		
		
		
	}

}
