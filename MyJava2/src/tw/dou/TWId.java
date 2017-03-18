package tw.dou;

public class TWId {
	private String id;//a.ID不隨意更改
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";//rank by wiki https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89
	
	
	//身分證字號產生器//////////////////////////////////
	TWId(){//完全隨機
		this((int)(Math.random()*2) == 0);//true or false
		System.out.println((int)(Math.random()*2));
	}
	TWId(boolean isFemale){//指定男女
		this(isFemale, ((int)(Math.random()*26)));
	}
	TWId(int area){//指定製發地區
		this(((int)(Math.random()*2)==0), area);
	}
	TWId(boolean isFemale, int area){//指定男生-->台北, 女生-->台中
									//建構式中第一道敘述句不是super就是this(2選1),無this時系統自動編譯為super().
		//suer();(被此建購式省略)
		char f0 = letters.charAt(area);
		char f1 = isFemale?'2':'1';//女2 男1
		String temp = "" + f0 + f1;
		for(int i=0; i<7; i++){
			temp += (int)(Math.random()*10);
		}
		for(int i=0; i<10; i++){
			if(isCheckOK(temp + i)){id =temp +i; break;}			
		}
	}
	//身分證字號產生器//////////////////////////////////
	
	TWId(String id){
		this.id = id;//c.this(寶寶的).id講的是line 4 id //line 6id為傳遞近來的值
	}
	//true-->female; false-->male
	boolean isFemale(){
		char gender = id.charAt(1);//A123456789 get "1"
		return gender == '2';
	}
	
	//
	static boolean isCheckOK(String id){//d.檢查機制: 傳一個東西來驗證
		if(!id.matches("^[A-Z][12][0-9]{8}$")) return false; 
		char f0 = id.charAt(0);//id抽出第一個字母Y
		int n12 = letters.indexOf(f0) + 10; //"Y" -->位置21 + 基數10
		int n1 = n12 / 10;//取Y31/10中的3
		int n2 = n12 % 10;//取31/10中餘數的1
		int n3 = Integer.parseInt(id.substring(1, 2));//id抽出第二個數, 字串轉int
		int n4 = Integer.parseInt(id.substring(2, 3));//id抽出第二個數, 字串轉int
		int n5 = Integer.parseInt(id.substring(3, 4));//id抽出第二個數, 字串轉int
		int n6 = Integer.parseInt(id.substring(4, 5));//id抽出第二個數, 字串轉int
		int n7 = Integer.parseInt(id.substring(5, 6));//id抽出第二個數, 字串轉int
		int n8 = Integer.parseInt(id.substring(6, 7));//id抽出第二個數, 字串轉int
		int n9 = Integer.parseInt(id.substring(7, 8));//id抽出第二個數, 字串轉int
		int n10 = Integer.parseInt(id.substring(8, 9));//id抽出第二個數, 字串轉int
		int n11 = Integer.parseInt(id.substring(9, 10));//id抽出第二個數, 字串轉int
		int sum = n1*1 + n2*9 +	n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
		return sum%10 == 0;
	}
	
//HW	static boolean preCheck(String id){//id事先檢查,1.長度須為10, 2.第一碼charAt(0)須為A-Z, 3.第二碼charAt(1)須為1 or 2, 4.其他後八碼須為0-9
//		boolean result =true;
//		if(id.length() != 10){result = false;}
//		else if(letters.indexOf(id.charAt(0)) == -1) return false;
//		else if(id.charAt(1) != 1 || id.charAt(1) != 2) return false;
//		else if()
//		return result;
//		}
	
	
	String getId(){
		return id;//b.可以看ID
	}

}
