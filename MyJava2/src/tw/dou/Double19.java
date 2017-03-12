package tw.dou;
//洗牌發牌V2
public class Double19 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();//傳回系統時間
		int [] poker = new int[52]; //0-51都是0
		boolean isRepeat;	int temp;
		for(int i =0; i<52; i++){//i代表洗出幾張
			do{
				temp = (int)(Math.random()*52);
			//檢查機制避免重複
			isRepeat = false;
				for(int j=0; j<i; j++){
					if(poker[j]==temp){
						isRepeat = true;
						break;}
				}

			}while(isRepeat);
			poker[i]=temp;
			System.out.println(poker[i]);
	}
		System.out.println("------------------------------------------");
		System.out.println("耗時"+(System.currentTimeMillis() - start));//單位千分之一秒
}
}
