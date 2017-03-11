package tw.dou;

public class Double12 {
//陣列
	public static void main(String[] args) {
		int[] a;//整數陣列名叫a, 
		a = new int[3];//任何只要看到new即是做一個物件, 新增整數空間3,
						//0, 1, 2位置
		System.out.println(a.length);
		for(int i=0; i<a.length; i++){//i給值為0
			System.out.println(a[i]);
		}
	}
}
