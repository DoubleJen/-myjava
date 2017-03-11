package tw.dou;

public class Double11 {

	public static void main(String[] args) {
		for (int i=1, j=10; i<10; i++, j--){
			System.out.println(i + ":" + j);
			if(j==7){//==比對至7提早離開,
				break;
			}
		}
		System.out.println("----------------------------");
		
		for (int i=0; i<10; i++){
			if(i%2==0) continue;//continue這一輪至此不做下面sysout,繼續往下一個作.ex2/2可整除,不sysout,換3
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		dou:
		for (int i=0; i<10; i++){
			for(int j=9; j>0; j--){
				System.out.println(i + ":" +j);
				if(j%5==0) break dou;//break dou離開dou這個迴圈(標記只能標記迴圈結構)
			}
		}
		
	}

}
