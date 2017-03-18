package tw.dou;
//物件導向
public class Bikedo {

	public static void main(String[] args) {
		//System.out.println(Bike.counter);//還沒開始做BIKE
		Bike b1 = new Bike();//Bike前已定義//建構式建構值//一個類別一個物件只會被呼叫一次
			//new Bike();//建構式進行物件初始化 fr Bike.java
		Bike b2 = new Bike();//Bike前已定義, 1.2為double值, 回傳V2
			//Bike b3 = new Bike(1f);//Bike前已定義, 1f為float值, 回傳V3
		System.out.println(b1.a);//b1.a=1
		System.out.println(b2.a);//b2.a=1
		System.out.println(Bike.counter);//counter不屬於物件, 屬於Bike類別
		
		System.out.println("----------------------------");
		
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		//System.out.println(b3.getSpeed());
		b1.upSpeed();//加速
		b1.upSpeed();//加速
		b1.upSpeed();//加速
		b1.upSpeed();//加速

		b2.upSpeed();//加速
		b2.upSpeed();//加速
		b2.upSpeed(1);//加速1檔
		b2.upSpeed(2);//加速2檔//overloading同名異式
		
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		
		
		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println("---------------------------");
//		
//		System.out.println(b1.getSpeed());//char無東西, 因為0是無法列印.//初始化100.0
//		b1.upSpeed();//加速
//		b1.upSpeed();//加速
//		b1.upSpeed();//加速
//		b1.upSpeed();//加速
//		System.out.println(b1.getSpeed());

	}

}
