package com.s2;

import com.s1.Student1;
import com.s1.Student2;

public class B extends Student1 implements Student2
{
	private int eng;

	public B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}

	public void skill()
	{
		System.out.println("B skill");
	}

	public String show()
	{
		return super.show()+"\t英文:"+eng;
	}

	
}
