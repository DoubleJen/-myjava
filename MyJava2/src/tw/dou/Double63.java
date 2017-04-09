package tw.dou;
//Collection2:　List有順序性(一個接一個) 可重覆(將有2個相同物件)
import java.util.LinkedList;

public class Double63 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
//		list1.add("A");
//		list1.add("B");
//		list1.add(0, "C");//add(int index, E element)指定位置
//			//list1.add(3, "C");//index位置須小於等於現在list1.size
//		System.out.println(list1);
		
//		list1.add(0,"A");
//		list1.add(0,"B");//新加入擺前
//		list1.add(0,"C");//新加入擺前
//		System.out.println(list1);
//		System.out.println(list1.get(1));//取出[1]

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");
		System.out.println(list1);//驗證允許重覆
		list1.remove("B");//一次砍一個,砍第一個
		System.out.println(list1);
		list1.remove("B");
		System.out.println(list1);
	}

}
