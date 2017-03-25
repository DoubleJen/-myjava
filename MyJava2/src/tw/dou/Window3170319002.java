package tw.dou;
//視窗程式+版面+隔間+NORTH
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;//extends JFrame後自動生成
import javax.swing.JPanel;

public class Window3170319002 extends JFrame{
	private JButton open, save, exit;//版面設計時擁有has a open, save, exit屬性
	private MyPainter170325001 myPainter;
	Window3170319002(){//建構式-->物件初始化的過程
		//suer();(被此建購式省略)-->沒被指定為this
		super("視窗程式");//title
		
		setLayout(new BorderLayout());//隔間
		open = new JButton("Open");//new出open
		save = new JButton("Save");//new出save
		exit = new JButton("Exit");//new出exit
		myPainter = new MyPainter170325001();
		
		JPanel top =  new JPanel(new FlowLayout());//處理上面的隔間-->為容器
		top.add(open); top.add(save); top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(myPainter, BorderLayout.CENTER);
		
		setSize(640, 480);//設定大小
		setVisible(true);//設定顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE);//按下叉叉就結束run
		
	}
	
	public static void main(String[] args) {
		new Window3170319002();//new出一個物件, 初始化frWindow2170319001(){的建構式
		

	}

}