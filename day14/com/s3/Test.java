package com.s3;
import com.s1.Student1;
import com.s1.Student2;
import com.s2.A;//import com.s2.*;
import com.s2.B;
class Test//com.s3.Test
{
	public static void main(String[] args) {
		System.out.println("hello java");

		Student1 s1=new Student1("AAAAaa");
		System.out.println(s1.show());


		Student2 s2;

		Student2.skill3();


		A a=new A("a",70);//is-a A ,is-a Student1 , is-a Student2
		a.skill();
		System.out.println(a.show());
		a.skill2();



		B b=new B("bb",90);//is-a B ,is-a Student1 , is-a Student2
		b.skill();
		System.out.println(b.show());
		b.skill2();



	}
}