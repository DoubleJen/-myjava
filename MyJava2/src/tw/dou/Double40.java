package tw.dou;
//IO
	//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Double40 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");//C:/test/brad.txt"\"跳脫字元中Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
												//"."現在所在目錄
		try {
			FileReader reader = 
					new FileReader(file);
			int temp;
			while((temp = reader.read()) != -1){
				System.out.print((char)temp);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
