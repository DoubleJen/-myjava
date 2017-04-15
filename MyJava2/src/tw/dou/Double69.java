package tw.dou;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Double69 extends JFrame {
	private MyClock myClock; 
	private MyPool myPool;
	
	Double69() {
		setLayout(new BorderLayout());
		
		myClock = new MyClock();
		add(myClock, BorderLayout.NORTH);
		
		myPool = new MyPool();
		add(myPool, BorderLayout.CENTER);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Double69();

	}

}
