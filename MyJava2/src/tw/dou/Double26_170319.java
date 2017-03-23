package tw.dou;

public class Double26_170319 {

	public static void main(String[] args) {
		//Double263.m1();
		Double263 b1 = new Double263();
		//Double263 b2 = new Double263();//-->s1s2s3只呼叫一次
	}
}

class Double261{//extend Object 無任何建構式時, 有時就不會幫他編譯至Object
	static{System.out.println("s1");}
	Double261(){System.out.println("Double261()");}
	Double261(int a){System.out.println("Double261(int)");}
}

class Double262 extends Double261{//只有屬性方法有繼承, 建構式無 只有初始化的動作, 262找步道261無傳參數建構式
	//類別定義當中只有1.屬性2.方法3.建構式
	static{System.out.println("s2");}
	Double262(String a){
		//super();-->沒被指定為this, 偷偷叫261-->但261沒有無傳參數建構式-->error
			//super(2);//Double261(int a)
		System.out.println("Double262(String)");
	}
}

class Double263 extends Double262{//只有屬性方法有繼承, 建構式無 只有初始化的動作, 262找步道261無傳參數建構式
	static{System.out.println("s3");}
	Double263(){
		super("double");//Double262(String a)//()內如果血int 數字,262找無, 261雖有, 但不可越級呈報
		System.out.println("Double263()");
	}
	static void m1(){System.out.println("m1()");}
}
