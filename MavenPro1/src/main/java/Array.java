
public class Array {
	public void arr()
	{
try
{

		int a[]= {1,2,3,4};
		System.out.print(a[10]);

}
catch(ArithmeticException f)
{
System.out.print(f);	
}
catch(ArrayIndexOutOfBoundsException f)
{
	System.out.print(f);
}
catch(Exception f)
{
	System.out.print(f);
}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array s=new Array();
s.arr();
	}

}
