package tw.dou;

public class Doulbe06 {
	
	public static void main(String[] args) {
		int a = 9, b = 3;
		if(a-- >= 10 && b++ <= 3){
			System.out.println("OK:a = "+ a + ",b=" +b);
		}
		else{
			System.out.println("XX:a = "+ a + ",b=" +b);
		}
		//&&and ||or 判斷, 只會做一個
		//&and |or 運算(進行二進位的運算), 缺一不可, 前後都會做
	}

}
