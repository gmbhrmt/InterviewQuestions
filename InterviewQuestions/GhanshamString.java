package CoreJava;

public class GhanshamString {

	// Ques : Seperate the integer and character from an array [1,a,b,4,h,5]
	// Ques : how to add 999 in each String Array have number like abc834,bdr333,kcj654
	
	public static void main(String[] args) {
		GhanshamString obj =new GhanshamString();
		char ch[] = {'9','a','3','b','4','f'};
		String[] str = obj.charQuest(ch);
		
		System.out.println("----Output of Question 1 ");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		str = null;
		obj.StringArrayAddQues();
	}
	
	public String[] charQuest(char[] ch) {
		char[] chAr = new char[ch.length];
		char[] intAr = new char[ch.length];
		int chIndx = 0;
		int intIndx = 0;
		
		for(char c : ch) {
			if(Character.isLetter(c))
				chAr[chIndx++] = c;
			else
				intAr[intIndx++] = c;			
		}
		
		return new String[]{String.copyValueOf(chAr).trim(),String.copyValueOf(intAr).trim()};
	}
	
	public void StringArrayAddQues() {
		String[] str = {"abc834","bdr333","kcj654"};
		
		String[] newStr = new String[str.length];
		
		for(String st : str) {
			newStr = charQuest(st.toCharArray());
			newStr[1] =String.valueOf(Math.addExact(Integer.parseInt(newStr[1]), 999));
			
			System.out.println(newStr[0] + ":" +newStr[1]);
		}
		
	}
	
	public void CompleteStringEx() {
		String s1 = new String("you can't change me");
		String s2 = new String("you can't change me");
		System.out.println(s1 == s2); // false
		String s3 = "you can't change me";
		String s4 = "you can't change me";
		System.out.println(s1 == s4);// false
		System.out.println(s1 == s3);// false
		String s5 = "you can't " + "change me";
		System.out.println(s3 == s5);// true
		String s6 = "you can't ";
		String s7 = s6 + "change me";
		System.out.println(s3 == s7);// false
		final String s8 = "you can't ";
		String s9 = s8 + "change me";
		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true
		
		System.out.println(7/2);
	}
	
	

}
