class School { //表School
//field
	private String name;
//constructor,new了一定要做的事
	School(String name)	{
		this.name=name;
	}
//method.get/set
	String getName()	{
		return name;
	}
//method.動作
	String show()	{
		return "表School.動作show=> 姓名:"+name;
	}

	void change(String name)	{
		this.name=name;
	}


}