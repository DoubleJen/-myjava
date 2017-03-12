package tw.dou;

import javax.swing.JOptionPane;

//猜數字
public class DoubleString02 {

	//在上面之前用來create a answer
	static String createanswer(int d){
		//產生三個不重複的數字,同洗牌邏輯
		boolean[] check =new boolean[10];//樣本數0-9格:全都false
		int[] poker = new int[d];//0-2格:全都0
		int temp;
		int counter=0;
		for(int i=0; i<poker.length; i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while(check[temp]);
				poker[i]=temp;
				check[temp]=true;
			
		}
		String ret= "";
		for(int v:poker) ret += v;
		return ret;
		}
	
	//method: checkAB(answer, guess)=>?A?B
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for(int i= 0; i<g.length(); i++){//陣列.length--->屬性 ,字串.length()是呼叫方法-->
			if(g.charAt(i) == a.charAt(i)){//g中的第i碼是否與a中的第i碼相等
				A++;
			}else if(a.indexOf(g.charAt(i))!=-1){
				B++;//g中的第i碼是否存在於a中 >=0 or !=-1
			}
		}
		return A+"A"+B+"B";//return is 回傳, sysout is 輸出,
	}
	
	public static void main(String[] args) {
		//1.產生謎底
		String answer= createanswer(3);//ctrl+點擊可維護該字串, 想產生4馬呼應至line6/9
		System.out.println(answer);

		
		//2.開始
		boolean isWinner = false;
		for(int i=0; i<10; i++){
			//2.1輸入a number
			String guess= JOptionPane.showInputDialog("猜一個數字");
		
			//2.2number比對, 產生結果
			String result= checkAB(answer, guess);//check幾A幾B
			JOptionPane.showMessageDialog(null, result);//
			if(result.equals("3A0B")){
				//2.3猜對, WINNER, break 脫離
				isWinner = true;
				break;
			}
			
				//2.4猜錯, REPEAT 10次, 超過10次, LOSSER
			
			//3. 顯示訊息
			if(isWinner){
				JOptionPane.showMessageDialog(null, "恭喜發財");
			}else{
				JOptionPane.showMessageDialog(null, "魯蛇, Answer is" + answer);
			}
				
		}

	}

}
