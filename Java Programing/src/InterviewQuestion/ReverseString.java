package InterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String name = "Vaibhav";
		int length = name.length();
		String reverse ="";
		
		for(int i=length-1;i>=0;i--)
		{
			reverse =reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}

}


