package tw.dou;

public class Double22 {

	public static void main(String[] args) {
		int[][] b={{1,2,3,4},{5,6,7},{8,9},{10},{11,12,13}};
		//method1:
		for(int i=0; i<b.length; i++){//跑第一個維度
			for(int j=0; j<b[i].length; j++){
				System.out.print(b[i][j] + "  ");
			}
		}
		System.out.println("--------------------------");

		//method2:
		for(int[] v1:b){
			for(int v2:v1){
				System.out.print(v2+"  ");
			}
		}
		System.out.println("--------------------------");
}

}
