package tw.dou;
//Exception例外
public class Double34 {
	public static void main(String[] args) {
		int a=10, b=0;
		int[] c = {1, 2, 3, 4};
		//只要try catch被捕捉到 將繼續跑程式
		try{
			System.out.println(a / b);//原除以零出例外, 所以hello world無法印出, 因這段有可能出現例外 用try catch包住
			System.out.println(c[2]);//原該印出3,惟除以零出例外,所以該行跳過
			System.out.println(c[4]);//因沒有東西, trycatch至System.out.println("XX");
		}
		catch(ArithmeticException ae){//if出現算數例外 例外形成的物件實體會被傳遞 針對該事件處理
			System.out.println("87");//b例外跑來這裡
		}
		catch (ArrayIndexOutOfBoundsException ee) {
			System.out.println("XX");//c[4]例外跑來這裡
		}
		catch(RuntimeException re){//廣域方式處理執行階段例外, 如有特殊例外要處理,細節寫前面如算數例外 大的寫後面(沒有直系關係無須注意順序性)
			System.out.println("OK");
		}
		
		System.out.println("Hello, World");
	}

}
