package tw.dou;
//IO
	//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Double41 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");//C:/test/brad.txt"\"跳脫字元中Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
												//"."現在所在目錄
		try{
			FileInputStream fin =//水龍頭開啟 
					new FileInputStream(file);
			
			byte[] buf = new byte[(int)file.length()];//只能讀"2G"內檔案(int(2^32)的一半)
			int len = fin.read(buf);
			System.out.println(new String(buf,0,len));
			
			
			fin.close();//水龍頭關掉
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
		
//		catch(FileNotFoundException ee){//先小
//			System.out.println(ee.toString());
//		}catch(IOException ee){//後大
//			System.out.println(ee.toString());
//		}
		
		
//		if(file.exists()){System.out.println("OK");}//OK時取得絕對路徑+ file.getAbsolutePath()
//		else{System.out.println("XX");}
	}

}
