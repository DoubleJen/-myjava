package tw.dou;
//繼承與例外
import java.io.IOException;
import java.rmi.RemoteException;

import javax.print.PrintException;

public class Double36 {

	public static void main(String[] args) {


	}

}

class Double361{
	void m1() throws IOException{}
}

class Double362 extends Double361{
	void m1() throws RemoteException{}//override, under extends丟出的例外範圍要比父代少//繼承好事發揚 壞事減少
}