package tw.dou;
//賽車範例(執行緒, interrupt提早結束)
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes = new JLabel[8];//多個物件陣列跑道,初值為null
	private Car[] cars = new Car[8];
	private int rank;
	private boolean isRunning;//預設為false
	
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+1, 1));
		go= new JButton("GO!"); add(go);
		
		for(int i=0; i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + "." );
			lanes[i]=lane;//把lane放進陣列
			add(lane);//把lane放進畫面
		}
	
		go.addActionListener(new ActionListener() {//按下go按鈕做的事情	
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
		if(!isRunning){
			isRunning = true;
			rank =1;
			for(int i=0; i<lanes.length; i++){
				lanes[i].setText((i+1) + ".");//按次按下go後清畫面
			}
			for(int i=0; i<cars.length; i++){
				cars[i] =  new Car(i);
			}
			for(int i=0; i<cars.length; i++){
				cars[i].start();
			}
		}
		
	}
	
	private void stopgame(){
		for(Car car:cars){
			car.interrupt();
		}
		isRunning=false;
	}
	
	//寫成內部類別方便存取外部類別屬性方法
		private class Car extends Thread{
			private int lane;
			Car(int lane){this.lane=lane;}
			
			@Override
			public void run() {
				boolean isRunning = true;
				for(int i=0; i<100; i++){
					lanes[lane].setText(lanes[lane].getText() + ">");//把原本的加回來加上">"
					try {
						Thread.sleep(10 + (int)(Math.random()*200));//每一台車變化性即為每步間的間隔時間10~(10+199)
					} catch (InterruptedException e) {
						return;//run方法結束
					}
				}
				//lanes[lane].setText(lanes[lane].getText() + rank++);//名次顯示, ++在後
				lanes[lane].setText(lanes[lane].getText() + "==> WINNER");
				stopgame();
				
				
				
			}
		}
	
	public static void main(String[] args) {
		new Racing();

	}

}
