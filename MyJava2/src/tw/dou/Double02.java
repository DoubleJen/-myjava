package tw.dou;

public class Double02 {

	public static void main(String[] args) {
		double score = Math.random();
		System.out.println(score);
		
		int intScore = (int)(Math.random()*100+1);
			//100:100個, +1:位移
		System.out.println(intScore);

		
		double score1= 12.7;
		int intScore1= (int)score1;
		System.out.println(intScore1);
		
		if(intScore>=60){
			System.out.println("Pass");
		}
		else{
			System.out.println("Down");
		}
		
	}

}
