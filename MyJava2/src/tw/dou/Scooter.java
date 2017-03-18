package tw.dou;
//繼承(把功能強化)
public class Scooter extends Bike {//Scooter父類別為Bike 摩托車老爸為BIKE
	Scooter(){
		//suer();(被此建購式省略)-->沒被指定為this, 偷偷叫BIKE
		System.out.println("Scooter()");
	}
	void upSpeed(){
		super.upSpeed();//先利用父的,在做自己的強化功能, 如果無這句, 形同完全抹煞原BIKE功能
		speed = (speed<1)?1.5:(speed *3.2);//BKIE的speed為private，摩托車不可用--> The field Bike.speed is not visible
	}
}
