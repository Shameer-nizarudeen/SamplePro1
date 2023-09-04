package exceptionthrow;

public class ThrowsEx1 {
public void add1() throws ArithmeticException
{
	throw new ArithmeticException("invalid");
}
public void add2()
{
	this.add1();
	

}
public void add3()
{
	
try

{
	add2();
}
catch(ArithmeticException f)
{
	System.out.println(f);
}
finally
{
	System.out.println("not Invalid");
}

}
public static void main(String arg[])
{
ThrowsEx1 s=new ThrowsEx1();
s.add3();

}
}


