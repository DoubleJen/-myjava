package tw.dou;
//Regular Expression正規表示式https://zh.wikipedia.org/wiki/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F & matches(String regex)
public class TWIdString {

	public static void main(String[] args) {
		String id = "A123456789";
		System.out.println(id.matches("^[A-Z][12][0-9]{8}$"));
		/*
		 * ^開頭, $結尾 中間沒講為空字串 
		 * [A-Zxyz]A-Z外加xyz字元集合取一
		 * [^A-Zxyz]非A-Z外加xyz字元中的集合取一
		 * [0-9]{8}-->[]出現8次
		 * [0-9]{1, 4}-->[]至少出現1 2 3 4次
		 * [0-9]{0, 4}-->[]至多出現4次,可不出現
		 * [0-9]{4,}-->[]出現4次以上
		 * 
		 *   
		 */
	}

}
