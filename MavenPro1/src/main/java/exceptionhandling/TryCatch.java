package exceptionhandling;

public class TryCatch {
	public void tryc1()
	{
		try
		{
		int a=10/0;
		System.out.print(a);
		
	}
	
		catch(ArithmeticException f)
		{
			System.out.print(f);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TryCatch s=new TryCatch();
		s.tryc1();

	}

}
