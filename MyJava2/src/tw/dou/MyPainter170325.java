package tw.dou;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainter170325 extends JPanel 
	//implements MouseListener
	{
	private int x0, y0, x1, y1, x, y, w, h;
	private MyMouseAdapter myMouseAdapter;
	
	public MyPainter170325(){
		setBackground(Color.GREEN);
		//自己不聽了addMouseListener(this);//找寶寶我聽 this代表本類別物件
		myMouseAdapter = new MyMouseAdapter(this);
		addMouseListener(myMouseAdapter);//
		x0 = y0 = x1 = y1=-1;//讓一開始點看步道
	}
	
	void setX0(int x0){this.x0=x0;}
	void setY0(int y0){this.y0=y0;}


	
	//元件長什麼樣子由該方法實做
	@Override
		protected void paintComponent(Graphics g) {//近來是很厲害的g
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D)g;//很厲害的g強制轉型為Graphics2D g2d
			g2d.setStroke(new BasicStroke(4));//設定粗細
			g2d.setColor(Color.RED);//線條色彩
			g2d.drawLine(x0, y0, x1, y1);
			//g2d.drawOval(x, y, w, h);
			System.out.println("paint");
		}

	void changeLine(int x1, int y1){
		this.x1 = x1; this.y1 = y1;
		int r = Math.abs(x0-this.x1);//半徑
		w = h = 2*r;//W寬h高等於2r 2倍半徑
		x = x0 - r;
		y = y0 - r;
		repaint();//repaint to "System.out.println("paint");"
	}
	
//	@Override
//	public void mouseClicked(MouseEvent e) {//按下離開原地無click
//		System.out.println("Clicked");//
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//	}//至少要有{}代表有實作
//
//	@Override
//	public void mouseExited(MouseEvent e) {	
//	}//至少要有{}代表有實作
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		x0= e.getX(); y0= e.getY();	
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		x1= e.getX(); y1= e.getY();
//		int r = Math.abs(x0-x1);//半徑
//		w = h = 2*r;//W寬h高等於2r 2倍半徑
//		x = x0 - r;
//		y = y0 - r;
//		repaint();//repaint to "System.out.println("paint");"
//	}

}
//用this
class MyMouseAdapter extends MouseAdapter{//170325start物件與物件傳遞特色 //MouseAdapter其實裡面空空的
	private MyPainter170325 painter;//互相認識目的
	public MyMouseAdapter(MyPainter170325 painter){
		this.painter = painter;
	}//互相認識目的
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setX0(e.getY());
		//replace by x0= e.getX(); y0= e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		int x1 = e.getX(), y1 = e.getY();
		painter.changeLine(x1, y1);
	}
	
}
