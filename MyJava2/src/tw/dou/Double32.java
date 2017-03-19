package tw.dou;
//強制轉型
public class Double32 {

	public static void main(String[] args) {
		Double321 b1 = new Double322();
		b1.m1();
		Double322 b2 = (Double322)b1;//b1骨子為322-->強制轉型(Double322)
		b2.m2();//換回本尊可執行
		Double321 b3 = new Double323();
		Double322 b4 = (Double322)b3;//編譯時期過關 執行階段失敗 永遠看直系 勿看旁系
//		Bike b5 =  new Bike();
//		Double322 b6 = (Double322)b5;//非同一家族, 轉型失敗

		
	}

}

class Double321{
	void m1(){System.out.println("Double321:m1()");}
}

class Double322 extends Double321{
	void m1(){System.out.println("Double322:m1()");}
	void m2(){System.out.println("Double322:m2()");}
}

class Double323 extends Double321{
	void m1(){System.out.println("Double322:m1()");}
	void m2(){System.out.println("Double322:m2()");}
}