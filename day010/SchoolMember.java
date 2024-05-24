class SchoolMember { //資料表 SchoolMember表
//field
	private String name;
	private String address;

//constructor
	Member(String name,String address) {
		this.name=name;
		this.address=address;
	}
	
	//method
	String show()
	{
		return "名:"+name+"\t地址:"+address;
	}
}