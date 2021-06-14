package InterviewQuestion;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1221;
		int temp = number;
		int rem, rev=0;
		
		while(temp!=0) 
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp =temp/10;
		}
		if(number==temp)
		{
			System.out.println(number+"is Palindrome Number");
		}
		else
		{
			System.out.println(number+"is not Palindrome Number");
		}

	}

}
