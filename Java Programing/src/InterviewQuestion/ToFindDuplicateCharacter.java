package InterviewQuestion;

public class ToFindDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Great responsibility";  
		int length = s.length();
		char[] ch = s.toCharArray();
		
		for (int i =0 ; i<length ;i++)
		{
			for(int j=i+1 ; j<length ; j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println(" Character repeating are " +ch[j]);
					break;
				}
			}
		}
	}

}
