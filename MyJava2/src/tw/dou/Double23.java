package tw.dou;

import java.util.Arrays;

//洗牌發牌V3
public class Double23 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();//傳回系統時間
		boolean[] check =new boolean[52];//0-51格:全都false
		int[] poker = new int[52];//0-51格:全都0
		int temp;
		int counter=0;
		for(int i=0; i<52; i++){
			do{
				temp = (int)(Math.random()*52);
				counter++;
			}while(check[temp]);

				poker[i]=temp;
				check[temp]=true;
				System.out.println(temp);
			
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//發牌給四個玩家,每家13張
		int[][] player = new int[4][13];
		for(int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];//[i%4][i/4]
		}
		System.out.println("----------------------------------------------");
		
		//攤牌
		String[] suits = {"黑桃","紅心","方塊","梅花"};//suit花色,suit[0]黑桃
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//values值,values[0]A
		for(int[] cards : player){
			//理牌
			Arrays.sort(cards);
			for(int card : cards){
				System.out.print(suits[card/13] + values[card%13] + "  ");
				
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		
		

		System.out.println("-----------------------");
		System.out.println("耗時"+(System.currentTimeMillis() - start));//單位千分之一秒
		System.out.println("次數"+counter);
	
}
}
