package tw.dou;
//不定個數
public class Double43 {

	public static void main(String[] args) {
		sayYa1("D", "E", "F");
//		sayYa2(new String[]{"T", "B", "E"});
//		sayYa3(3, "B", "E");
	}
	
//	static void sayYa(String name){//明確方法存在先跑明確方法先-->sayYa()中只有一個名字
//		System.out.println("Ya, " + name);
//	}
//	static void sayYa(String name1, String name2){//明確方法存在先跑明確方法先-->sayYa()中只有二個名字
//		System.out.println("Ya, " + name1);
//		System.out.println("Ya, " + name2);
//	}
	static void sayYa1(String... names){//"..."不定個數, 無明確方法才跑這-->sayYa()中無名字或三個以上名字
									   //names其實是字串陣列String[]={"T","B",...}=>同static void sayYa(String[] names)
		for(String name:names){
			System.out.println("Ya " + name);//針對name去跑而非names
		}
			System.out.println("OK");
	}
//	static void sayYa2(String[] names){
//		for(String name:names){
//		System.out.println("Ya " + name);
//		}
//	}
//	static void sayYa3(int n, String... names){//","前代表至少要有一個固定參數int a(一定要放在不定個數參數前)
//		System.out.println("OK");
//		}
}
