class Company { //資料表Company,其實公司不知道有2個下屬部門在使用他的資源
//field
	String name;
	String address;
//constructor
	Company(String name) {
		this.name=name;
		System.out.println("新增一位員工,名="+name);
	}
	Company(String name,String address)	{
		this.name=name;
		this.address=address;
		System.out.println("新增一位員工,名="+name+"\t地址:"+address);
	}
}