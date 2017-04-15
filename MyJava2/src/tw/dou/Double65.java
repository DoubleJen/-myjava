package tw.dou;
//執行緒Thread=>不一定誰先開始
public class Double65 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");//產生一執行緒物件實體
		MyThread mt2 = new MyThread("B");
//		mt1.run();//呼叫run"物件"方法, 先run方法結束後, 才會sysout Hello World
		mt1.start();//呼叫start方法表現生命特徵, start非馬上開始, 而是進入排隊狀態(等候區,等候挑選進來去運作)
//		mt1.start();//任何一個執行緒物件只能呼叫一次start, 因為生命只有一條, 否則會出錯誤訊息java.lang.IllegalThreadStateException(如一顆子彈只能發射一次)
		mt2.start();
		
		try {
			Thread.sleep(500);//請主執行緒先睡0.5秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello, World");
		
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------");
		mt1.run();//執行緒雖結束, 但物件(如大體)仍存在
	}

}

class MyThread extends Thread{//定義一個繼承Thread的MytThread, MyThread類別會表現"一個"生命周期的表現(只有這招才會有執行緒-->因此才有生命週期)
	private String name;
	MyThread(String name) {this.name = name;}
	
	@Override//override thread的run方法, 以表現MyThread的生命特徵
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name + ": " + i);//藉由name顯示哪個執行緒先跑
			
			//印出name:i後, 請他去睡覺, 睡完非馬上執行, 而是進入等候區"排隊", 所以不一定ABAB印
			try {
				Thread.sleep(100);//millis千分之一秒為單位, 1000代表一秒鐘
			} catch (InterruptedException e) {
//				e.printStackTrace();//沒有任何因素可以使其中斷
			}
			
		}
	}
}
