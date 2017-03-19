package tw.dou;

public class Double30 {

	public static void main(String[] args) {

	}

}

interface Double301{//interface"介面"骨子裡也是類別(無父子關係), 他就是個認證考試("規格"), 無規定用第幾招實做去考("不會有實作東西"), 所以裡面方法永遠是抽象方法, abstract可加可不加
	void m1();//抽象方法. 因是給人實做 所以隱含的是public//-->先天式public abstrace
	void m2();
}

class Double302 implements Double301{//interface用來實做的
	public void m1(){}
	public void m2(){}	
}

abstract class Double303 implements Double301{//interface用來實做的
	public void m1(){}
	//public void m2(){}沒實做完改天再說, 所以303 class須為抽象類別	
}