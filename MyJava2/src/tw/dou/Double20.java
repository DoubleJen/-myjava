package tw.dou;
//洗牌發牌V3
public class Double20 {

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
		

		System.out.println("-----------------------");
		System.out.println("耗時"+(System.currentTimeMillis() - start));//單位千分之一秒
		System.out.println("次數"+counter);
	
}
}
