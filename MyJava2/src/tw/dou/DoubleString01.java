package tw.dou;
//String
public class DoubleString01 {

//	static String cc(){
//	return "CC";	
//	};
	
	
	public static void main(String[] args) {
		String s1= new String();
		
		byte[] b1= {97,98,99,100,101,102,103,104};
		String s2 = new String(b1);//abcdefgh
		
		String s3= new String(b1, 2, 4);//String(byte[] bytes, int offset, int length) 2偏移量 4長度, cdef
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4= "abcdefg";//JAVA中任何雙引號""包起來的任何東西均是物件
		//return s4;
		
		char c1= s2.charAt(3);
		System.out.println(c1);//d
		System.out.println("abcdefg".charAt(3));//d
		
		String a="abcdefg";
		System.out.println(a.indexOf('c'));//''單引號為字眼//傳回位置2,沒有的傳回-1

}

}
