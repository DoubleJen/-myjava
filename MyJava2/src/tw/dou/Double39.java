package tw.dou;
//IO
	//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Double39 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");//C:/test/brad.txt"\"跳脫字元中Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
												//"."現在所在目錄
		try{
			FileInputStream fin =//水龍頭開啟 
					new FileInputStream(file);
			
			byte[] buf = new byte[3];//因為UTF8 一個中文字為3byte, 所以2(MS950即Big5)改3
			int len;
			while( (len = fin.read(buf)) != -1){//read()一次讀ˇ3個byte 不等於負一(即沒到尾巴) 就進去印出來
				System.out.print(new String(buf,0,len));
			}
			
			
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
