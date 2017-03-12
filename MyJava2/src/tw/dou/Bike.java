package tw.dou;

public class Bike {
	private double speed;//腳踏車現在擁有速度這個屬性//private成為封包,Bikedo就看不到
	void upSpeed(){
		speed = (speed<1)?1:(speed *1.2);//速度小於1給1:否則速度*1.2
	}
	void downSpeed(){
		speed *= 0.7;//如何減速度???
	}
	double getSpeed(){//加裝錶,回傳speed
		return speed;
	}
}
