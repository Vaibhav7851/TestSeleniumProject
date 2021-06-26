package InterviewQuestion;

public class ReverseStringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Java is good";
		char[] ch = s.toCharArray();
		String result = "";
		
		for(int i = ch.length-1; i>=0 ; i--)
		{
			result = result + ch[i];
		}
		
 System.out.println(result);
	}

}
