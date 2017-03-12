package tw.dou;


public class DoubleString03 {

	
	public static void main(String[] args) {
		String a =new String("abc");//人工new出來的,佔一個記憶體位置
		String b =new String("abc");//人工new出來的,佔一個記憶體位置
		String c ="abc";//系統看到abc先自動new出一個物件, then c指向該位置
		String d ="abc";//上面已經new出一個abc, then d也指向該位置.
		String e = a;
		//==用在物件是比是否相同物件
		System.out.println(a == b);//false
		System.out.println(c == d);//true,系統看到abc先自動new出一個物件, then cd會指向同一個位置
		System.out.println(a == e);//true
		
		//比內容是否相等用equals
		System.out.println(a.equals(b));
		
	}
	
	
}
