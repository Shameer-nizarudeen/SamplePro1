package maven1;

public class SuperKeyPar extends SuperKeyword {

	public void add2()
	{
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		SuperKeyPar s=new SuperKeyPar();
		
s.add1();
s.add2();
	}

}
