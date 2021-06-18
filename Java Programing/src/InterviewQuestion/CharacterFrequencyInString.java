package InterviewQuestion;

public class CharacterFrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "VaibhaV";
		char[] c = s.toCharArray();
		int cz = c.length;
		int i=0, j=0, counter=0;
		for(i=0;i<cz;i++)
		{
			counter=0;
			for(j=0;j<cz;j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
				}
				if(c[i]==c[j])
				{
					counter++;
				}
				if(j == cz-1)
				{
					System.out.println("The Element " + c[i] + " Is present "+counter);
				}
			}
		}

	}
	
}
