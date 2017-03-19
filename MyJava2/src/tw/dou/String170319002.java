package tw.dou;
//StringBuffer(V1.0 發佈) StringBuilder(V1.5 發佈, 比較快,  not safe for use by multiple threads多重執行序)
public class String170319002 {
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1;
		sb1.append("12345678901234567");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1 == sb2);
		
	}
	
	
}
