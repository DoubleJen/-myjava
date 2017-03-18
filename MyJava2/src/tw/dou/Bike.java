package tw.dou;
//170318類別設計，定義這台Bike
public class Bike {
	//private double speed;//腳踏車現在擁有速度這個屬性//private成為封包,Bikedo就看不到
	double speed;
	int a; //顏色屬性a=0未上色
	static int counter;//顏色屬性b=0未上色 ,插在b有static
	
	Bike(){//初始化動作
		this(0);//0 is int, 跳至LINE8//寶寶的....
	}										//建構式長相與方法類似,無傳回值,其名稱必須與...依樣
	Bike(int s){//初始化動作,與上區分
		this(s*1f);//s*1f is float, 跳至LINE11
	}
	Bike(float s){//初始化動作,與上區分
		this(s*1.0);//s*10 is double, 跳至LINE14
	}
	Bike(double s){//初始化動作,與上區分
		speed = s;//指定速度
		a++;//變色
		counter++;//變色
		System.out.println("Bike:Bike()v2");//隨意印任何東西
	}
	
	
	void upSpeed(){
		speed = (speed<1)?1:(speed *1.2);//速度小於1給1:否則速度*1.2
	}
	void upSpeed(int gear){//1速 2速 加上檔位
		speed = (speed<1)?1:(speed *(1.2+gear));//速度小於1給1:否則速度*1.2
	}
	void downSpeed(){
		speed *= 0.7;//如何減速度???
	}
	double getSpeed(){//加裝錶,回傳speed
		return speed;
	}
}
