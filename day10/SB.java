class SB extends Company {
//field欄位
	int ram;
	/*
	[延伸加上extends] [資料表Company]的
	String name;
	String address;
	*/
//constructor,new SA()時就看SA(需要的東西)
	SB(String name,int ram) {
		super(name);
		this.ram=ram;		
		System.out.println("SB_有ram下屬部門, 有ram數量="+ram);
	}

	SB(String name,String address,int ram) {
		super(name,address);
		this.ram=ram;		
		System.out.println("SB_有ram下屬部門, 有ram數量="+ram);
	}
}