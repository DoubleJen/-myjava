package tw.dou;

public class Double03 {

	public static void main(String[] args) {
/////////////////////////////////////////////////////////////	
		int intScore = (int)(Math.random()*100+1);
			//100:100個, +1:位移
		System.out.println(intScore);
	
		if(intScore>=90){
			System.out.println("A");
		}
		else{
			if(intScore>=80){
				System.out.println("B");
			}
			else{
				if(intScore>=70){
					System.out.println("C");
				}
				else{
						if(intScore>=60){
							System.out.println("D");
						}
						else{
							System.out.println("E");
						}
					}
				}
			}
/////////////////////////////////////////////////////////////////

		int intScore2 = (int)(Math.random()*100+1);
		
		System.out.println(intScore2);
		}
	
}
