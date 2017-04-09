package tw.dou;
//物件實體印出
//Collection1: Set無順序性(無一個接一個) 不重覆(將不會有2個相同物件)
import java.util.HashSet;
import java.util.Iterator;

public class Double61 {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();//先不泛型<E>//Hashset"set" is a set and is a collection
		int i1 =12;
		Integer i2 = new Integer(34);
		set.add(i2);//i2為物件
		set.add(i1);//i1 Auto-Boxing後成為另一物件new Integer(i1)進入-->因此進入set的為物件,非基本型別
		System.out.println(set.size());//set中有兩個物件
		System.out.println(set);//to String
		System.out.println("*****************************");
		//取出做法1:迭代
		Iterator it = set.iterator();//從set取出迭代的物件it
		while(it.hasNext()){//判斷物件it有無下一個,有下一個進入
			Object obj = it.next();//物件it取出下一個(無泛型取出物件)
			Integer m =(Integer)obj;//因為要使用整數物件的方法,所以物件obj強制轉型為m(int為基本型別)
			System.out.println(m.floatValue());
			//System.out.println(obj);//不轉型也可以印出
		}
		System.out.println("+++++++++++++++++++++++++++++");
		//取出做法2:for each is a Collection就可以用for each
		for(Object obj1: set){System.out.println(((short)obj1));}//obj1轉型為基本型別(只能有一次性動作)-->runtime時存在轉型失敗的風險(需try catch處理)-->int印出的東西為值
		
		
//		Bike1 b1 = new Bike1();
//		String s1 = "Brad";
//		Integer i = new Integer(12);
//		Integer j = new Integer("78");
//		System.out.println(j);//類別中"物件實體"要印出會印出其to string方法(印出過程1.物件所在類別記憶體位置 2.override to String)
//		System.out.println("----------------------------");
//		
//		int kk3 = 56;
//		Integer k3 = kk3;//ii3assign給i3, 用56的"值"包成"物件"-->自動裝箱Auto-Boxing
//		System.out.println(kk3);//印出"值"
//		System.out.println(k3);//印出"物件"-->i3的toString
//		System.out.println(k3.floatValue());//印出"物件"-->i3的floatValue
	}

}

class Bike1{
	@Override
	public String toString() {
		return super.toString();
	}
}