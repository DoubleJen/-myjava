package tw.dou;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MySignPanel extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;
	//數個點HashMap<key"x", 值x>構成有順序性的線 LinkedList
	//HashMap<String, Integer>產生1個點
	//LinkedList<HashMap<String, Integer>>產生1條線
	//LinkedList外面再包一個LinkedList變成很多條線
	//
	
	public MySignPanel(){
		setBackground(Color.GREEN);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);//點下去再做的
		addMouseMotionListener(listener);//拖曳再做的
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
	}
	
	//1.偵測滑鼠事件mouse event 2.放在資料結構data structure 3.draw出來
	//方便存取外部屬性方法所以寫成內部類別
	

	
	private class MyMouseListener extends MouseAdapter{
		@Override//點下去再做的
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			//新的線
			recycle.clear();//畫新線recycle清除
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());//e.getX傳回整數
			point.put("y", e.getY());//e.getY傳回整數
			line.add(point);//把點加入線
			
			lines.add(line);//須與資料結構結合,只含一個點的新線納入資料結構
		}
		
		@Override//拖曳再做的
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());//e.getX傳回整數
			point.put("y", e.getY());//e.getY傳回整數
			lines.getLast().add(point);//把點加入最後一條線getLast(), 加到最新那條線
			repaint();//畫面實現
		}
	}
	
	@Override//如何將line資料畫出來
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);//畫筆色彩
		g2d.setStroke(new BasicStroke(4));//畫筆粗細
		
		for(LinkedList<HashMap<String, Integer>> line:lines){//lines中尋訪所有線條
			for(int i=1; i<line.size(); i++){//從第1點開始才能劃線(0~1點構成一條線)
				HashMap<String, Integer>p0 = line.get(i-1);//線中取出點
				HashMap<String, Integer>p1 = line.get(i);//線中取出點
				int x0 = p0.get("x"), y0 = p0.get("y");
				int x1 = p1.get("x"), y1 = p1.get("y");
				g2d.drawLine(x0, y0, x1, y1);
			}
		}		
	}
	
	//畫面清除功能
	public void clear(){
		lines.clear();//拿掉所有元素
		repaint();//畫面實現
	}
	
	//畫面undo功能
	public void undo(){
		if(lines.size()>0){
			recycle.add(lines.removeLast());
			//lines.removeLast()拿掉其最後一個元素
			//recycle.add(lines.removeLast())你丟我撿, recycle撿(add)起lines丟(remove)的
			repaint();//畫面實現
		}
	}
	
	//畫面redo功能
	public void redo(){
		if(recycle.size()>0){
			lines.add(recycle.removeLast());
			//lines.add(recycle.removeLast())你丟我撿, lines撿(add)起recycle丟(remove)的
			repaint();//畫面實現
		}	
	}
}
