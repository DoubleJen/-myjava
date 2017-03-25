package tw.dou;
//brad V2
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainter170325001 extends JPanel{
	private int x0, y0, x1, y1, x, y, w, h;
	
	public MyPainter170325001(){
		setBackground(Color.GREEN);
		addMouseListener(new MyMouseAdapterV3());
		x0 = y0 = x1 = y1=-1;//讓一開始點看步道
	}
	
	//元件長什麼樣子由該方法實做
	@Override
		protected void paintComponent(Graphics g) {//近來是很厲害的g
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D)g;//很厲害的g強制轉型為Graphics2D g2d
			g2d.setStroke(new BasicStroke(4));//設定粗細
			g2d.setColor(Color.RED);//線條色彩
			g2d.drawLine(x0, y0, x1, y1);
			//g2d.drawOval(x, y, w, h);
			//System.out.println("paint");
		}

	//改成內部類別寫法
	private class MyMouseAdapterV3 extends MouseAdapter{//MouseAdapter其實裡面空空的
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			x0= e.getX(); y0= e.getY();
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			x1 = e.getX(); y1 = e.getY();
			int r = Math.abs(x0-x1); 
			w = h = 2*r;
			x = x0 - r;
			y = y0 - r;
			repaint();
		}
		
	}	

}

