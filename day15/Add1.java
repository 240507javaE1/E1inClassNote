class School {
	void show() {
		System.out.println("school show");
	}

	class A {
		void show() {
			System.out.println("A show");
		}

		/*static void shw2() {
			外面A沒static裡面不能static
		}
		*/
	}
}

class Add1
{
	public static void main(String[] args) {
		//School$A a=new School$A();
		/*School s1=new School();
		s1.show();*/

		//new School().show();

		//A a=new A();
		/*School.A a=new School().new A();
		System.out.println(a);
		a.show();*/

		new School().new A().show();

	}
}