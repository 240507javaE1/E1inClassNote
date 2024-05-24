class CA extends School {
//field欄位
	private int chi;

//constructor,new了一定要做的事
	CA(String name,int chi)	{
		super(name);
		this.chi=chi;
	}
//method.get/set
	int getChi()	{
		return chi;
	}
//method.動作
	void change(int chi)	{
		this.chi=chi;
	}
}