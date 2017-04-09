package tw.dou;
//介面與子介面
public class Double60 {

	public static void main(String[] args) {
	}
}

interface Double601{
	public void m1();//介面永遠無實做,所以永遠無implements該字
}

interface Double602{
	public void m2();//介面永遠無實做,所以永遠無implements該字
}

interface Double603 extends Double601{//繼承601,即強化601定義
	public void m3();	
}

interface Double604 extends Double601, Double602{//介面中可繼承多個,並只能繼承介面,類別中只能有一個繼承父親
	public void m3();
}

class Double605 implements Double603{
	public void m1(){}
	public void m3(){}	
}

class Double606 implements Double604{
	public void m1(){}
	public void m2(){}
	public void m3(){}	
}

class Double607 extends Double605{
	public void m1(){}//m1()-->override, 傳回值型別必須一樣-->void, 存取修飾字必須大於等於爸爸 -->public 
}
