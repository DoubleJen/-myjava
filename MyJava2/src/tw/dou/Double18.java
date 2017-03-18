package tw.dou;
//do while
public class Double18 {

	public static void main(String[] args) {
		int a = 10;
		do {
			System.out.println(a--);//do先做
		}while(a<10);//a<10時(即true成立時), 上面do重做直至a不小於10, 相較於for是後測試(for先測試)

	}

}
