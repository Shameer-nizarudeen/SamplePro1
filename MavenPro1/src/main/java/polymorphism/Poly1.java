package polymorphism;

public class Poly1 extends Poly2{
	public void print2()
	{
		//super.print1();
		System.out.print("World");
	}
public static void main(String args[])
{
	Poly1 s=new Poly1();
	s.print2();
	Poly2 a=new Poly2();
	a.print1();
}
}
