package tw.dou;
//二維陣列
public class Double16 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[2][3];
		System.out.println(a[1][2]);
		
		System.out.println("----------------------------------");
		
		int[][] aa;
		aa = new int[2][];//第二個[]先不說, 第一個[]不可為空
		aa[0] =new int[3];
		aa[1] =new int[2];
		System.out.println(aa.length);
		
		System.out.println("----------------------------------");
		
		for(int i=0; i<aa.length; i++){
			for(int j=0; j<aa[i].length; j++){
				System.out.println(aa[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
	}

}
