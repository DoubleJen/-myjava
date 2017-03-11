package tw.dou;

public class Double13 {
//丟骰子, 統計各點出幾次
	public static void main(String[] args) {
		int[] p= new int[7]; //0 - 6 =>0
		//int p1, p2, p3, p4, p5, p6;
		//p1 = p2 = p3 = p4 = p5 =p6 =0;
		for (int i=0; i<100000; i++){
			int dice=(int)(Math.random()*6+1);//出現1to6點
			p[dice]++;
			//switch(dice){
				//case 1: p1++; break;
				//case 2: p2++; break;
				//case 3: p3++; break;
				//case 4: p4++; break;
				//case 5: p5++; break;
				//case 6: p6++; break;
				//default: System.out.println("break"); break;	
			}
		for(int i=0; i<p.length; i++){
			System.out.println((i+1) + "點出現" + p[i] +"次");
		}
		
		
		
		
	
	}

}
