class CB extends School {
//field欄位
	private int eng;
	
//constructor,new了一定要做的事
	CB(String name,int eng)	{
		super(name);
		this.eng=eng;
	}
//method.get/set
	int getEng()	{
		return eng;
	}
//method.動作
	void change(int eng)	{
		this.eng=eng;
	}
}