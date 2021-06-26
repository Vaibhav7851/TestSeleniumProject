package InterviewQuestion;


class A
{
	public void show()
	{
		System.out.println("Print A");
	}
	
}

class B extends A
{
	public void show()
	{
		System.out.println("Print B");
	}
}
public class methodOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B();
		obj.show();

	}

}
