package tw.dou;
//1.for-each
//2.exchange array element(改牌位置
public class Double21 {

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5};
		//method 1:
		System.out.println(a.length);
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		
		//method 2:for each
		for(int v: a){
			System.out.println(v);
		}
		System.out.println("-----------------------");
		
		//exchang: 2
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		System.out.println("-----------------------");
		for(int v: a){
			System.out.println(v);
		}
		////////////////////////////////////////
		//System.out.println("POKER文具行買回來的");
		//int[] b= new int[52];
		//for(int i=0; i<a.length; i++) a[i]=i;
		//////////////////////////////////////

		
		
		
}

}
