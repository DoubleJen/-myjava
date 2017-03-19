package tw.dou;
//StringBuffer前練習 
public class String170319001 {

	public static void main(String[] args) {
//		String s1 = "Double";
//		String s2 = s1;
//		System.out.println(s1 == s2);//true
//		s1 ="Hello";
//		System.out.println(s1 == s2);//false
//		System.out.println("---------------------------------");
		
		String s3 = "Double";
		System.out.println(s3.concat("1234567"));//產生新字串"Double1234567"
		System.out.println(s3);//回傳原字串"Double"
		System.out.println(s3.replace('D', 'd'));//產生新字串"double"
		System.out.println(s3);//回傳原字串"Double"
	}

}
