class parent1
{
	void quality1()
	{
		System.out.println("quality of parent 1");
	}
	parent1()
	{
		System.out.println("in parent1 constructor");
	}
}
interface parent2
{
	void quality2();
}
class child extends parent1 implements parent2
{
	public void quality2()
	{
		System.out.println("quality of parent 2");
	}
	child()
	{
		System.out.println("in child class construcor");
	}
}
public class Q7program {

	public static void main(String[] args) {
		child obj=new child();
		obj.quality1();
		obj.quality2();
		

	}

}
