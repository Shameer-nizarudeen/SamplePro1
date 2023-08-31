package finalpro;

public class FinalKey {
	final int a=10;
	public void print()
	{
		System.out.print("Hello");
	}
public static void main(String args[])
{
	FinalKey c=new FinalKey();
	System.out.print(c.a);
	c.print();
}
}
