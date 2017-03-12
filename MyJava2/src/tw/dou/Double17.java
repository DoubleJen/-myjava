package tw.dou;
//洗牌發牌
public class Double17 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();//傳回系統時間
		int [] poker = new int[52]; //0-51都是0
		for(int i =0; i<52; i++){//i代表洗出幾張
			int temp = (int)(Math.random()*52);
			//檢查機制避免重複
			boolean isRepeat = false;
			for(int j=0; j<i; j++){
				if(poker[j]==temp){
					isRepeat = true;
					break;
				}
			}
			if(!isRepeat){//!相反意思
				poker[i] = temp;
				System.out.println(poker[i]);
			}else{
				i--;//這圈不算
			}
			
		}
		System.out.println("------------------------------------------");
		System.out.println(System.currentTimeMillis() - start);//單位千分之一秒

		
		
		
		
		
	}

}
