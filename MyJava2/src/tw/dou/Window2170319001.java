package tw.dou;
//視窗程式+版面+隔間
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;//extends JFrame後自動生成

public class Window2170319001 extends JFrame{
	private JButton open, save, exit;//版面設計時擁有open, save, exit屬性
	Window2170319001(){//建構式-->物件初始化的過程
		//suer();(被此建購式省略)-->沒被指定為this
		super("視窗程式");//title
		
		setLayout(new FlowLayout());//父JFrame說setLayout可處理版面  ,丟一個室內設計師"new FlowLayout()"給 Window2170319001來處理版面
		setLayout(new BorderLayout());//隔間
		open = new JButton("Open");//new出open
		save = new JButton("Save");//new出save
		exit = new JButton("Exit");//new出exit
		add(open, BorderLayout.NORTH); 
		add(save, BorderLayout.WEST); 
		add(exit, BorderLayout.CENTER);//new出來,把open, save, exit加入, 並隔間
		
		setSize(640, 480);//設定大小
		setVisible(true);//設定顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE);//按下叉叉就結束run
		
	}
	
	public static void main(String[] args) {
		new Window2170319001();//new出一個物件, 初始化frWindow2170319001(){的建構式
		

	}

}
