package encapsulation;

public class Class1 {
	private int a;
	private String name;
	public void setter(int a,String name)
	{
		this.a=a;
		this.name=name;
	}
	public void getter()
	{
		System.out.print(a+" "+name);
	}

}
