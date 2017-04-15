package tw.dou;
//Timer and TimerTask
import java.util.Timer;
import java.util.TimerTask;

public class Double68 {
	private static Timer timer;
	public static void main(String[] args) {//方法中的變數較區域變數
		timer = new Timer();
		timer.schedule(new MyTask("A"), 1000, 500);//時間由timer排, 1秒鐘印(name +": "+ i++), 間隔1秒再印一次, 直到永遠
		timer.schedule(new MyTask("B"), 1800, 300);//
		//timer.schedule(new StopJava(timer), 10*1000);
		timer.schedule(new MyStop(), 10*1000);
		System.out.println("main");
	}
	
	private static class MyStop extends TimerTask{
		@Override
		public void run() {
			timer.cancel();
			
		}
	}

}

class MyTask extends TimerTask{
	private String name;
	private int i;
	public MyTask(String name) {this.name = name;}
	@Override
	public void run() {
		System.out.println(name +": "+ i++);//做什麼事這兒決定
	}
}

class StopJava extends TimerTask{
	private Timer timer;
	public StopJava(Timer timer) {this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
		
	}
}
