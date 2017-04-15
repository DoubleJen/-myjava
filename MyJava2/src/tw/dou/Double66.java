package tw.dou;
//該範例相較Double65 彈性大,因實做runnable後, 還可認其他父親
public class Double66 {

	public static void main(String[] args) {
		Thread2 t2 = new Thread2("A");//t2非執行緒只是runnable
		Thread tt2 = new Thread(t2);
		
		Thread2 t3 = new Thread2("B");//t3非執行緒只是runnable
		Thread tt3 = new Thread(t3);
		
		tt2.start();
		tt3.start();
		

	}

}

//class Thread1 extends Thread{//只有這招才會有執行緒
//	@Override
//	public void run() {
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//		}
//	}
//}

class Thread2 implements Runnable{
	String name;
	Thread2(String name){this.name =name;}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}