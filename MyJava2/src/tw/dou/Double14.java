package tw.dou;

public class Double14 {
//丟骰子, 統計各點出幾次
	public static void main(String[] args) {
		int[] p= new int[6]; //0 - 6 =>0
		
		for (int i=0; i<100000; i++){
			int dice=(int)(Math.random()*9);//出現0-8點=>6,7,8
			p[(dice>=6)?dice-3:dice]++;//()>=6-->dice-3-->否則維持原樣   "三元運算式"
			
			}
		for(int i=0; i<p.length; i++){
			System.out.println((i+1) + "點出現" + p[i] +"次");
		}
		
		
		
		
	
	}

}
