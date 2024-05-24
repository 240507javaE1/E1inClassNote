class B extends Student {
//field欄位,B打從一開始就有的東西
	int excel;
	/*
	[延伸加上extends] [資料表Student]的
	String name;
	int chi;
	*/


	void show()
	{
		System.out.println("名:"+name+
			"\t國文:"+chi+
			"\texcel:"+excel);

	}
}