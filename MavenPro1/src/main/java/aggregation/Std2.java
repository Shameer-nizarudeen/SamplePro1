package aggregation;

public class Std2 {
	String address;
	Std1 s;
	public Std2(String address,Std1 s)
	{
		this.address=address;
		this.s=s;
	}
	public void print()
	{
		System.out.println(address+" "+s.name+" "+s.rollno);
	}

	public static void main(String[] args) {
		Std1 o=new Std1(21,"Anju",14);
		Std2 a=new Std2("OOLAMPARA",o);
		a.print();
		

	}

}
