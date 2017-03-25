package tw.dou;
//內部類別
public class Double33 {

	public static void main(String[] args) {
		Double331 obj1 = new Double331();//外部的
		obj1.m1();//外部的
		System.out.println("---------------------------------");
		Double331.Double3311 obj2 = obj1.new Double3311();//從外部物件obj1叫到內部, 物件級別的內部類別
		obj2.m1();
		Double331.m3();
		Double331.Double3312 obj3 = new Double331.Double3312(); //static來new出一個物件實體 ,類別級別的內部類別
	}

}

class Double331{
	Double331(){System.out.println("Double331");}
	void m1(){System.out.println("Double331:m1()");}
	void m2(){System.out.println("Double331:m2()");}
	static void m3(){}
	
	class Double3311{
		Double3311(){System.out.println("Double3311()");}
		void m1(){
			System.out.println("Double3311:m1()");
			m2();//回頭呼叫331的m2
			Double331.this.m1();//回頭呼叫331的m1
		}
	}
	
	static class Double3312{
		Double3312(){System.out.println("Double3312()");}
		void m1(){
			System.out.println("Double3312:m1()");
			//static中無物件存在//Double331.this.m1();//回頭呼叫331的m1
		}
	}
}