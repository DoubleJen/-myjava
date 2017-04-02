package tw.dou;
import java.awt.Color;

//視窗程式
import javax.swing.JFrame;//extends JFrame後自動生成

public class Window extends JFrame{
	
	Window(){//建構式-->物件初始化的過程
		//suer();(被此建購式省略)-->沒被指定為this
		super("視窗程式");//title
		setSize(640, 480);//設定大小
		setVisible(true);//設定顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE);//按下叉叉就結束run
		
	}
	
	public static void main(String[] args) {
		new Window();//new出一個物件, 初始化fr line 7的建構式
		

	}

}
