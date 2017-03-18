package tw.dou;

public class TWId001 {

	public static void main(String[] args) {
		System.out.println(TWId.isCheckOK("B220570472"));//檢查機制:有ID字串先檢查驗證""內容是否OK
//		
		TWId id1 =  new TWId();//隨機產生
		TWId id2 =  new TWId(1);//指定地區
		TWId id3 =  new TWId(false);//指定男女
		TWId id4 =  new TWId(true, 12);//指定男女地區
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
//		TWId id1 =new TWId("A123456789");//ID不可隨意更改只能看,所以封裝private
//		System.out.println(id1.getId());
//		if(id1.isFemale()){
//			System.out.println("女生");
//		}else{
//			System.out.println("男生");
//		}

	}

}
