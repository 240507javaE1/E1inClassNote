class A extends Student {
//field欄位,A打從一開始就有的東西
	int word;
	/*
	[延伸加上extends] [資料表Student]的
	String name;
	int chi;
	*/


	void show()
	{
		System.out.println("名:"+name+
			"\t國文:"+chi+
			"\tword:"+word);

	}
}