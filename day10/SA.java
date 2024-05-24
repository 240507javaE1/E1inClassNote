class SA extends Company {//資料表SA, [延伸加上extends] [資料表Company]
//field欄位
	int lcd;
	/*
	[延伸加上extends] [資料表Company]的
	String name;
	String address;
	*/
//constructor,new SA()時就看SA(需要的東西)
	
	SA(String name,int lcd)	{ 
		super(name);//super要放第一行,一定要選一個super做//superior()=company()
		this.lcd=lcd;
		System.out.println("SA_lcd下屬部門, 有lcd數量="+lcd);
	}

	SA(String name,String address,int lcd) {
		super(name,address); //有上級super,第1行就要放super
		this.lcd=lcd;		
		System.out.println("SA_lcd下屬部門, 有lcd數量="+lcd);
	}
}