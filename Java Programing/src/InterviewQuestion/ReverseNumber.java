package InterviewQuestion;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =12345;
		int rem , rev =0;
		
		while(number != 0) {
			rem =number % 10;
			rev = rev*10 + rem;
			number = number /10;
		}
		System.out.println(rev);
	}

}
