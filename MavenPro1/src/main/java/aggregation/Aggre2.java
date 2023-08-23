package aggregation;

public class Aggre2 {
	int v;
	Aggre1 s;
	public Aggre2(int v,Aggre1 s)
	{
		this.v=v;
		this.s=s;
	}
	public void print()
	{
		System.out.print(v+" "+s.name+" "+s.age);
	}

	public static void main(String[] args) {
		
Aggre1 o=new Aggre1(10,"Hello");
Aggre2 a=new Aggre2(2,o);
a.print();
}

}
