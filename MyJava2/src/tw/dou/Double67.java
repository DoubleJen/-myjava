package tw.dou;
//setDaemon
public class Double67 {

	public static void main(String[] args) {
		Double771 obj1 = new Double771();
		obj1.setDaemon(true);//Daemon惡魔(看不到的)-->true主緒的執行緒(背景中運作的程序)-->其生命跟著主緒走, 主緒結束時(印出OK),執行緒也不會存在了(預設為false時,主緒走完執行緒還是存在)
		obj1.start();
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");//

	}

}

class Double771 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
			try {
				Thread.sleep(100);//sleep精準度不高, 勿拿來控制週期任務
			} catch (InterruptedException e) {
			}
		}
	}
}