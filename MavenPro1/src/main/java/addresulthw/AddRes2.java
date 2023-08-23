package addresulthw;

public class AddRes2 extends AddRes1{
	public void add2()
	{
		super.add1();
		int z=c;
		if(z%10==0)
		{
			System.out.println("Its divisible");
		}
		else
		{
			System.out.println("its not divisible");
		}
	}

	public static void main(String[] args) {

		{
			System.out.println(AddRes1.add1());
			AddRes2 s=new AddRes2();
			s.add2();
		}
		

	}

}
