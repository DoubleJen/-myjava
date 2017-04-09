package tw.dou;
//HashSet => TreeSet排序 => addall
import java.util.HashSet;
import java.util.TreeSet;

public class Double62 {

	public static void main(String[] args) {
//		HashSet set = new HashSet();
//		set.add(12);
//		set.add(12);
//		set.add(12);
//		set.add(12.3);
//		set.add(56);
//		set.add(12.3);
//		set.add("Brad");
//		set.add(12.3);
//		System.out.println(set.size());//印出四個元素
//		System.out.println(set);//印出結果將無順序性, 多個一樣的(如12.3)最後僅會有一個出現(如12.3)
//		System.out.println("-----------------------");
//		//取出
//		for(Object obj:set){
//			System.out.println(obj);
//			
//		}
		
//		//印樂透號碼
//		TreeSet<Integer> set = new TreeSet<>();
//		int i=0;
//		while(set.size()<6){
//			set.add((int)(Math.random()*49+1));
//			i++;
//		}
//		System.out.println(set);//印出將不重覆
//		System.out.println(i);//驗證不重覆取出共跑幾次

//		TreeSet<Integer> set = new TreeSet<>();
//		set.add(12);
//		set.add(56);//當add下去後即開始做排序
//		
////		byte a = 13;
////		set.add(a);//byte=>int=>Integer只能轉型一次
		
////		set.add("78");
//			//<>泛型前,轉型失敗java.lang.Integer cannot be cast to java.lang.String
//			//<>泛型後,只能放<>泛型定義的東西
//		System.out.println(set);
		
//		TreeSet<String> set = new TreeSet<>();
//		set.add("1");
//		set.add("2");
//		set.add("12");
//		System.out.println(set);//驗證字串的排序
//		for(String obj:set){
//			System.out.println(obj);
//		}
		
		HashSet set = new HashSet();
		set.add(1);
		HashSet set2 = new HashSet();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set.addAll(set2);
		System.out.println(set2.size());
		System.out.println(set2);
		System.out.println(set.size());
		System.out.println(set);
		
	}

}
