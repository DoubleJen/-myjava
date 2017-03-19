package tw.dou;

public class Double28 {

	public static void main(String[] args) {
		//Double281 b1 = new Double281();//-->281講得不清不楚, 無法做出物件實體, 期待子類別
		Double281 b1 = new Double282();//-->Double281()
		Double281 b2 = new Double283();//-->Double281()
		b1.m2();//-->Double282:m2()
		b2.m2();//-->Double283:m2()

	}

}

abstract class Double281{//"具抽象方法的類別必須宣告為抽象"
	Double281(){System.out.println("Double281()");}
	void m1(){System.out.println("Double281:m1()");}
	abstract void m2();//不定義無實做,所以無{},讓子孫做-->抽象方法
}

class Double282 extends Double281{//
	void m2(){System.out.println("Double282:m2()");}//老大做了m2!!
}

class Double283 extends Double281{//
	void m2(){System.out.println("Double283:m2()");}//老二做了m2!!
}

abstract class Double284 extends Double281{//老三不成材 做不出m2!!-->繼續抽象下去
	void m3(){}
	abstract void m4();//284子孫須繼承做m2m4
}

abstract class Double285{//無抽象方法亦可宣告為抽象類別, 差別在於無法建構出
	void m1(){}
}


