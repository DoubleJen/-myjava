package tw.dou;
//數位簽名(序列化後可以undo
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DigitalSign extends JFrame {
	private JButton Clear, Undo, Redo, Color1, Save, Open;
	private MySignPanel msp;
	
	public DigitalSign(){
		super("Digital Sign");
		setLayout(new BorderLayout());
		
		Clear = new JButton("clear");
		Undo = new JButton("undo");
		Redo = new JButton("redo");
		Color1 = new JButton("color");
		JPanel top  = new JPanel(new FlowLayout()); top.add(Clear); top.add(Undo); top.add(Redo); top.add(Color1);
		add(top, BorderLayout.NORTH);
		
		msp = new MySignPanel();
		add(msp, BorderLayout.CENTER);
		//clear按鈕動作
		Clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.clear();	
			}
		});
		//undo按鈕動作
		Undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.undo();	
			}
		});
		//redo按鈕動作
		Redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.redo();
			}
		});
		//color按鈕動作
		Color1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color newColor = JColorChooser.showDialog(DigitalSign.this, "Select a color ", java.awt.Color.BLUE); 
				
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new DigitalSign();
		

	}

}
