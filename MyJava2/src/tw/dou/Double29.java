package tw.dou;

public class Double29 {

	public static void main(String[] args) {
		

	}

}

class Double291{
	//**private void m1(){}//存取修飾字privated 沒有要讓子孫OVERRIDE
	//***void m1(){}
	Double293 m1(){return new Double293();}
	String m2(){return "";}//不會被override
}

class Double292 extends Double291{
	//**void m1(){}//此處的存取修飾字須大於等於爸爸
	//***int m1(){return 1;}//要OVERRIDE m1必須與父類別一模一樣, 如父private ,只能做自己的(此時無override)
	Double294 m1(){return new Double294();}//override Double293 m1(){return new Double293();}
}

class Double293{}

class Double294 extends Double293{}