class School2
{
	void show1() {
		System.out.println("show1 sample");
	}

	static void show2()
	{
		System.out.println("show2 sample");
	}

	static class A {
		void show1()
		{
			System.out.println("a show1 sample");
		}

		static void show2()
		{
			System.out.println("a static show2 sample");
		}

		static void show2(String msg)
		{
			System.out.println("a static show2 sample msg="+msg);
		}

	}

}


class Add2 {
	public static void main(String[] args) {
		//new School2().show1();
		//School2.show2();


		School2.A a1=new School2.A();
		System.out.println(a1);
		a1.show1();

		new School2.A().show1();
		School2.A.show2("hello java");
	}

	
}