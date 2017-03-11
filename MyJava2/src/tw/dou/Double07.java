package tw.dou;

public class Double07 {

	public static void main(String[] args) {
		int a = 10;
		final int b = 13;
		switch(a){
		//切換, 結構內部會有兩個一樣的出現
		//byte short int char OK, long float double boolean no ok(int內可接受)
			case 1:
				System.out.println("A");
				break;
			case 10:
				//須為常數,不接受變數
				System.out.println("B1");
				break;
			case b-2:
				System.out.println("B2");
				break;	
			case 100:
				System.out.println("C");
				break;
			default://用在例外,不及備載
				System.out.println("D");
				break;
			
		}
	}

}
