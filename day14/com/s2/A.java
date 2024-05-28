package com.s2; //C:/day14/> if not find in java.lang => find at com.s2

import com.s1.Student1;
import com.s1.Student2;

//if not use package com.s2;, has to type as below
//class com.s2.B {
public class A extends Student1 implements Student2 { 
//Student1 will not find in com.s2/ so need import

//Field,
	private int chi;
//Constructor,
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}

//Method,
	public void skill()	{
		System.out.println("callout A.skill");
	}

	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}

}