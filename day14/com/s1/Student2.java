package com.s1; //This file is now like locate at /com/s1/		(Student2.java)

public interface Student2 //Auto inside public but not interface itself
{
	void skill();



	default void skill2() {
		System.out.println("callout default Student2.skill2");
	}

	static void skill3() {
		System.out.println("callout static Student2.skill3");
	}
}