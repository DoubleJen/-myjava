package tw.org.iii;

public class Double02 {

	
	/*變數定義
	 * 1st digital[a-zA-Z$_]
	 * 2nd digital[a-zA-Z0-9$_]*
	 * don't use keyword(color red)]
	 */
	
	//big5 = 2bytes = 2^16 = 65536 ; UTF8=2^24 
	 
	public static void main(String[] args) {
		byte aA1$_;
		aA1$_ = 111;
		System.out.println(aA1$_);
			
		
		//byte, short, int, long
		byte var1=127;
		byte var2, var3, var4;
		byte var5, var6=12;
			//變數無給值稱為無初始化
		System.out.println(var1);
		
		var1 ++;
			//無運算僅位移
		System.out.println(var1);
		
		var1 +=2;
			//無運算僅位移
		System.out.println(var1);
		
		var1 = (byte)(3 + var1);
			//(byte)強制轉換為byte
		System.out.println(var1);
		
		
		short var7 = 3276;
		int var8 = 2100000000;
		
		int var9 =10, var10=3;
		System.out.println(var9/var10);
		
		
		//float double浮點數
		double var11=10, var12=3;
		System.out.println(var11 / var12);
		
		double var13=10.123;
		System.out.println(var13);
		var13 = var13++;
		System.out.println(var13);
		
		
		//char字元
		char var14= 'a'; //a=97
		char var15= 100; 
		System.out.println(var14);
		System.out.println(var15);
		System.out.println(var14 + var15);//數學運算符號一出即便數學式
		
		//boolean
		boolean var16 = true;
		boolean var17 = false;
		
		
		
		
		
		
	}

}
