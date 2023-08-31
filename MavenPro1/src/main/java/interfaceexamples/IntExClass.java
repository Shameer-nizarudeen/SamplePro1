package interfaceexamples;

public class IntExClass implements IntEx1 {
	public void add()
	{
		System.out.print("HI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntExClass c=new IntExClass();
		c.add();
		System.out.print(c.a);
		
		

	}

}
