package tw.dou;

import javax.swing.JOptionPane;

public class Double5 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("輸入年分");
						//JOP alt / 輸入視窗
		
		int year = Integer.parseInt("input");
			//將字串轉換為int
		
		
		
		
		//int year = 2017;
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					//29
				}
				else{
					//28
				}
			}
			else{
				//29
			}
		}
		else{
			//28
		}
		
	}

}
