package InterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterFrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="vaibhav sinha";
		char[] schar = s.toCharArray();
		
		Map<Character, Integer> charmap = new HashMap<>();
		
		for (Character ch : schar) 
		{
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
			}
			else
			{
				charmap.put(ch, 1);
				
			}
			}
		Set<Character> keys = charmap.keySet();
		
		for (Character ch : keys)
		{
			if(charmap.get(ch)>1)
			{
				System.out.println("Character " + ch + " Repeating : "+ charmap.get(ch)+ " times." );
			}
			
		}
	}
	
}
