package week2.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String input="TestLeaf";
		//Output : To get the count of e;
		int count=0;
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]== 'e') {
				count++	;
			}			
		}
     System.out.println("Count of e " + count);
	}

}
