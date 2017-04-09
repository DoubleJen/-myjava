package tw.dou;
//Map無順序性(不屬於Collection)
import java.util.HashMap;
import java.util.Set;

public class Double64 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();//key是字串,值永遠為其他型別
		map.put("name", "Brad");//
		map.put("weight", 80.5);
		map.put("gender", true);
		System.out.println(map.get("gender"));//取得name or weight or gender(key)的value
		System.out.println(map);
		
		Set<String> keys = map.keySet();//尋訪key
		for(String key:keys){
			System.out.println(key + "=>" + map.get(key));//用key尋訪出value
		}
		System.out.println("---------------------");
		
		
//		
//		Object value =map.values();
//		System.out.println(value);
//		for(String values:value){
//			
//		}
		
//		map.put("weight", 70.5);//取代weight前面的值
//		System.out.println(map.get("weight"));//取得name or weight or gender(key)的value
//		System.out.println(map);

	}

}
