interface A {
	  void disp1();
	}
	 interface B extends A
	{
		void disp2();
	}
	class C implements B
	{
		public void disp1()
		{
			System.out.println("in display 1 function");
		}
		public void disp2()
		{
			System.out.println("in display 2 function");
		}
		public void disp3()
		{
			System.out.println("in display 3 function");
		}
	}
	public class Interfacedemo
	{
		public static void main(String[] args) {
			C obj=new C();
			obj.disp1();
			obj.disp2();
			obj.disp3();

		}
	}
