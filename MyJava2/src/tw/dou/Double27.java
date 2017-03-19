package tw.dou;

public class Double27 {

	public static void main(String[] args) {
		Double271 b1 = new Double271();//-->Doulbe271()
		System.out.println("--------------------------------");
		
		Double271 b2 = new Double272();//=左邊為宣告 右邊為實做-->271我要一台車, 272你做一台法拉利給我 ,"自動轉型"//-->Doulbe271()Doulbe272()
		Double272 b3 = new Double272();
		Double273 b4 = new Double273();
		//Double272 b2 = new Double271();//-->271我要一台法拉利, 272你做一台車給我-->邏輯不合
		b2.m1();
		//b2.m2();//271車無m2方法(因271看不建272的方法-->只看的到宣告的方法
		System.out.println(b2.a);//-->2
		//System.out.println(b2.b);//271無b-->error
		System.out.println("--------------------------------");
		
		myf1(b3);//b1234 all OK
	}
	
	static void myf1(Double271 b){//宣告進來共通變為車子(271), 272 273特殊功能不能在此用-->"多型"
		b.m1();//依照myf1()的車子去執行
	}
	

}

class Double271{
	int a;//a=0
	Double271(){a++; System.out.println("Doulbe271()");}
	void m1(){System.out.println("Double271:m1()");}
}

class Double272 extends Double271{
	int b;
	Double272(){a++; System.out.println("Doulbe272()");}
	void m1(){System.out.println("Double272:m1(); b=" +b);}//271 a有繼承給272
	void m2(){System.out.println("Double271:m2()");}
}

class Double273 extends Double271{//273與272為兄弟關係
}
