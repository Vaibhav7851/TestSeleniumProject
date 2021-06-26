package InterviewQuestion;


class casio
{
	public void add(int i , int j )
	{
		System.out.println(i+j);
	}
	public void add(int i , int j , int k)
	{
		System.out.println(i+j+k);
	}
}
public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio obj = new casio();
		obj.add(1, 2, 6);
		obj.add(4, 7);

	}

}
