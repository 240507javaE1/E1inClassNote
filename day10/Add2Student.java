class Add2Student
{
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.name);
		System.out.println(s.chi);
		//s.show();
		/*
		Student is-a Student;
		Student has-a name
		Student has-a chi
		*/


		A a1=new A();
		System.out.println(a1.name);
		System.out.println(a1.chi);
		System.out.println(a1.word);
		a1.show();
		/*
		A is-a A
		A is-a Student
		A has-a word
		A has-a show()
		A has-a name
		A has-a chi

		*/

		


		B b1=new B();
		System.out.println(b1.name);
		System.out.println(b1.chi);
		System.out.println(b1.excel);		
		b1.show();
		/*
		B is-a B
		B is-a Student
		B has-a excel
		B has-a show()
		B has-a name
		B has-a chi


		*/
	}
}