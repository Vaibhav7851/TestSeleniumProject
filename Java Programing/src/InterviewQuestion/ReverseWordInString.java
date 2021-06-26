package InterviewQuestion;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My Name is Vaibhav";
		
		String a[] = s.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
