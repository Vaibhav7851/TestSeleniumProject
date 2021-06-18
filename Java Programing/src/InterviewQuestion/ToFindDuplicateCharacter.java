package InterviewQuestion;

public class ToFindDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Great responsibility";  
		int count,i,j;
		char[] c = s.toCharArray();
		
		System.out.println(" Duplicate Array are :");
		
		for(i=0;i<s.length();i++)
		{
			count=1;
			for(j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j] && c[i]!=' ')
				{
					count++;
					//set the c[j] to zero so that visited charater can be avoided
					c[j]= 0 ;
					
				}
			
			}
			
			if(count >1 && c[i]!= '0')
			{
				System.out.println(c[i]);
			}
		}
       
	}

}
