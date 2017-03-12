package tw.dou;
//物件導向
public class Bikedo {

	public static void main(String[] args) {
		Bike b1 = new Bike();//Bike前已定義
		Bike b2 = new Bike();//Bike前已定義
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("---------------------------");
		
		System.out.println(b1.getSpeed());//char無東西, 因為0是無法列印.
		b1.upSpeed();//加速
		b1.upSpeed();//加速
		b1.upSpeed();//加速
		b1.upSpeed();//加速
		System.out.println(b1.getSpeed());

	}

}
