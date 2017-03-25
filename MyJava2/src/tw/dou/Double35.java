package tw.dou;
//多重例外範例
public class Double35 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		int n= 4;
		try{b1.setLeg(n);}
		catch (MyException ee) {
			System.out.println(ee.toString());
		}
		catch (MyException2 ee) {
			System.out.println(ee.toString());
		}
		catch(Exception ee){//宣告丟出Exception, 不知有12,所以這邊要多這個
			
		}
		System.out.println("END");
	}
}

class Bird{
	private int leg;//有一屬性腳
	//void setLeg(int n) throws MyException, MyException2{//"宣告"方法中可能會拋出MyException或MyException2
	void setLeg(int n) throws Exception{//或Exception
		if(n>2){
			throw new MyException2();//該方法中 此時此刻"拋"出例外
			//System.out.println("");//邏輯到不了這行
			}
		else if(n<0){throw new MyException();}
		leg = n;//設定有幾隻腳
	}
}

class MyException extends Exception{
	@Override
	public String toString() {
		return "哪有欠腳";
	}
}

class MyException2 extends Exception{
	@Override
	public String toString() {
		return "變種鳥";
	}
}