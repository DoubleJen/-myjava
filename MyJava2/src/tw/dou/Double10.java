package tw.dou;

public class Double10 {
//99乘法
	public static void main(String[] args) {
		int result;
		for(int k=0; k<2; k++){
					//k<2代表兩列
			for(int j=1; j<=9; j++){
				for(int i=2; i<=5 ;i++){
					int newi = i + k * 4;
					result = newi * j;
					System.out.print(newi + " X " + j + " = " + result + "\t");  //"\t tab鍵"
			}
			System.out.println();
			
		}
			System.out.println("-----------------------------------------------------");
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		}
	
	}

