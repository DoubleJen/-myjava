package tw.dou;
//數位時鐘
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;//一個時鐘MyClock擁有時間timer
	private int i;
	
	public MyClock(){
		timer = new Timer();//一個timer就夠了
		timer.schedule(new MyClockTask(), 0, 1000);//馬上做, 每間隔一秒做MyClockTask()
		
		
		
		
	}
	
	private class MyClockTask extends TimerTask{
		@Override
		public void run() {
			Calendar now = Calendar.getInstance();//getInstance()給目前的日期時間
			int hh = now.get(Calendar.HOUR_OF_DAY);
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh + ": "+ mm + ": "+ ss);//顯示現在時間
			
		}
	}

}
