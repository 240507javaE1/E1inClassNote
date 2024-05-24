class C extends School {
//method
	static int no;
	String show()
	{
		return "new C student";
	}

	public String toString()
	{
		no++;

		return getClass().getName()+"@"+no+"$"+(int)(Math.random()*10);

		//return "位址="+super.toString();
	}
}