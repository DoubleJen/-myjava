package tw.dou;

public class Double04 {
//閏年
	public static void main(String[] args) {
		int year = 2017;
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


