package tw.dou;
//例外與finally
public class Double37 {

	public static void main(String[] args) {
		new Double371().m1();
	}
}

class Double371{
	void m1(){//下方已處理 無須在m1後對外宣告
		try{
			System.out.println("dosomething");
			throw new Exception();
			
		}catch (Exception ee) {
			System.out.println("catch");
			return;//提早離開, 因此System.out.println("END") unreachable
		}finally{//整段try catch中 最後無論如何都會做的 .確保整段try catch後最後要做的事
			System.out.println("OK");
		}
		//System.out.println("END");
	}
}