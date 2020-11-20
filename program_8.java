class base1
{
	int num1=10;
	base1(int num1)
	{
		this.num1=num1;
		System.out.println(num1);
	}
	
}
class sub1 extends base1
{
	sub1()
	{
		super(20);
	}
	sub1(int num2)
	{
		super(30);
	}
}
public class Q8program {

	public static void main(String[] args) {
		sub1 s1=new sub1();

	}

}
