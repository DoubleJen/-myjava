package tw.dou;
//1....+100 with while
public class Double25 {

	public static void main(String[] args) {
		int a =1; int sum = 0;
		while(a<=100){
			sum += a++;
		}
		System.out.println("1+2+....+100=" + sum);
		System.out.println("---------------------------------------");
		
		//by for
		int b =1; int sum1 =0;
		for(;b<=100;){
			sum1 += b++;
		}
		System.out.println("1+2+....+100=" + sum1);
		System.out.println("---------------------------------------");


}

}
